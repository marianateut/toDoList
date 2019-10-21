package org.fasttrackit.todolist;

import org.fasttrackit.todolist.domain.ToDoItem;
import org.fasttrackit.todolist.persistance.ToDoItemRepository;
import org.fasttrackit.todolist.transfer.CreateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        CreateToDoItemRequest request = new CreateToDoItemRequest();
        request.setDescription("learn  JDBC");
        request.setDeadline(LocalDate.now());
        ToDoItemRepository  toDoItemRepository= new ToDoItemRepository();
//        toDoItemRepository.createToDoItem(request);
 //      toDoItemRepository.updateToDoItem(1,true);
    //    toDoItemRepository.deleteToDoItem(1);
        List<ToDoItem> toDoItems = toDoItemRepository.getToDoItems();

        System.out.println(toDoItems);
    }
}

