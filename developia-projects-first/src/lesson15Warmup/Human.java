package lesson15Warmup;

import java.util.Objects;

public abstract class Human {
public int counter;
public String name;
public String phone;
public int salary;

@Override
public String toString() {
	return "Human [counter=" + counter + ", name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Human other = (Human) obj;
	return counter == other.counter && Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
			&& salary == other.salary;
}


}
