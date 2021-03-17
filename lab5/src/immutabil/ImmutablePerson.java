package immutabil;

public final class ImmutablePerson {
    private final int id;
    private final String name;
    private final MutableDateOfBirth birthday;

    public ImmutablePerson(int id, String name, MutableDateOfBirth birthday) {
        this.id = id;
        this.name = name;
      //  this.birthday = birthday;
        this.birthday = new MutableDateOfBirth(birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MutableDateOfBirth getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
