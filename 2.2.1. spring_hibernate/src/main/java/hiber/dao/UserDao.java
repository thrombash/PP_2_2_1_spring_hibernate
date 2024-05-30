package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import javax.persistence.Query;
import java.util.List;

public interface UserDao {
   void add(User user);

   List<User> listUsers();

   User getByCar(String model, int series);
}
