package exemplu1;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)   {
            return false;
        }
        if(o instanceof Cat)    {
            Cat cat = (Cat) o;
            return name.equals(cat.name);
        //    return name.compareToIgnoreCase(cat.name) == 0;
        } else  {
            return false;
        }
    }

    @Override
    public int hashCode()   {
        char[] letters = name.toCharArray();
        int sum = 0;
        for( char c : letters)  {
            sum += c;
        }
        return sum;
    }


}
