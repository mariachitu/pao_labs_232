package repository;

import config.DatabaseConfiguration;
import model.Person;

import java.sql.*;
import java.util.Optional;

public class PersonRepository {

    //PreparedStatement
    public void insert(String name, double age)   {
        String insertPersonSql = "INSERT INTO person(name, age) VALUES(?, ?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, age);
            preparedStatement.executeUpdate();
        } catch (SQLException e)    {
            e.printStackTrace();
        }
    }

    public void insert(Person person)   {
        String insertPersonSql = "INSERT INTO person VALUES(null, ?, ?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setDouble(2, person.getAge());
            preparedStatement.execute();
        } catch (SQLException e)    {
            e.printStackTrace();
        }
    }

    public Optional<Person> getById(int id)   {
        String selectSql = "SELECT * FROM person p WHERE p.id = ?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToPerson(resultSet);
        } catch (SQLException e)    {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void updateName(String name, int id) {
        String updateNameSql = "UPDATE person SET name=? WHERE id=?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e)    {
            e.printStackTrace();
        }
    }

    //callableStatemnet
    public void insertPersonProcedure(Person person) {
        String sql = "{call insertPerson(?,?,?)}";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setString(2, person.getName());
            callableStatement.setDouble(3, person.getAge());

            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            System.out.println("user was added with id: " + callableStatement.getInt(1));

        } catch (SQLException e)    {
            e.printStackTrace();
        }
    }

    private Optional<Person> mapToPerson(ResultSet resultSet) throws SQLException  {
        if(resultSet.next())    {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            double age = resultSet.getDouble(3);
            return Optional.of(new Person(id, name, age));
        }
        return Optional.empty();
    }
}
