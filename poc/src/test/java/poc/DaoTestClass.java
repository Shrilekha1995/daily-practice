package poc;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.ModelMap;
import org.testng.Assert;
import static org.mockito.Mockito.times;
import com.app.controller.TaskController;
import com.app.model.Task;
import com.app.service.TaskService;
import static org.mockito.Mockito.when; 

@RunWith(MockitoJUnitRunner.class)
public class DaoTestClass {

	@Mock
	TaskService taskService;
	
	@InjectMocks
	TaskController taskController;
	
	@Spy
	List<Task> taskList= new ArrayList<Task>();
	

	
	@Spy
	ModelMap model;
	
	
	@Test
	public void findTaskByIdTest() {
		when(taskService.findAllTasks()).thenReturn(taskList);
		Assert.assertEquals(taskController.listTasks(model),"allTasks");
		verify(taskService,times(1)).findAllTasks();
		
	}

}
