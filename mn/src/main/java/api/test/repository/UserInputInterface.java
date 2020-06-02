package api.test.repository;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import api.test.model.UserInput;


public interface UserInputInterface{

    /*

    Long size();
    List<UserInput> findAll(int page, int limit);
    UserInput findById(@NotNull Long id);    
    boolean save(@NotNull UserInput userInput);
    boolean update(@NotNull Long id, String  user_name, String user_password);
    boolean destroy(@NotNull Long id);
    */

    List<UserInput> findAll(int page, int limit);
    Long save(@NotNull UserInput userInput);
    Long size();
    UserInput findById(@NotNull Long id);
    boolean update(@NotNull Long id, String user_name, String user_password);
    boolean destroy(@NotNull Long id);


    




}