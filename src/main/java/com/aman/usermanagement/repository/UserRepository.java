package com.aman.usermanagement.repository;

import com.aman.usermanagement.entity.User;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

   /* List<User> users = new ArrayList<>();


    public User save(User user) {
        //User user
        users.add(user);
        return user;
    }

    public User getUserById(int userId) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId() == userId)
                return user;
        }

        return null;
    }

    public List<User> getAllUsers() {

        return users;
    }

    public User deleteUserById(int userId) {
        for (int j = 0; j < users.size(); j++) {
            User user = users.get(j);
            if (user.getId() == userId) {
                users.remove(j);
                return user;

            }
        }
        return null;
    }


    public void update(User user) {
        for (int i = 0; i < users.size(); i++) {
            User user1 = users.get(i);

            if (user1.getId() == user.getId()) {
                users.remove(i);
                users.add(i, user);
                break;
            }
        }
    }
}
*/
	
	
	
}
