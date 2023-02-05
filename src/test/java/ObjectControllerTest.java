//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.example.demo.controlers.ObjectController;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.ResponseEntity;
//
//import com.example.demo.models.ObjectModel;
//import com.example.demo.services.ObjectService;
//
//@ExtendWith(MockitoExtension.class)
//public class ObjectControllerTest {
//
//    @InjectMocks
//    ObjectController objectController;
//
//    @Mock
//    ObjectService objectService;
//
//    @Test
//    public void getObjects_ReturnsAllObjects() {
//        List<ObjectModel> objects = new ArrayList<>();
//        objects.add(new ObjectModel(1, "object 1"));
//        objects.add(new ObjectModel(2, "object 2"));
//        when(objectService.getAllObjects()).thenReturn(objects);
//
//        ArrayList<ObjectModel> response = objectController.getObjects();
//        List<ObjectModel> responseObjects = response.getBody();
//
//        assertEquals(objects, responseObjects);
//    }
//
//    @Test
//    public void getObjectbyId_ReturnsObject() {
//        ObjectModel object = new ObjectModel(1, "object 1");
//        when(objectService.getObjectById(1)).thenReturn(object);
//
//        ObjectModel response = objectController.getObjectbyId(1);
//        ObjectModel responseObject = response.getBody();
//
//        assertEquals(object, responseObject);
//    }
//
//    @Test
//    public void saveObject_SavesObject() {
//        ObjectModel object = new ObjectModel(1, "object 1");
//        when(objectService.saveObject(object)).thenReturn(object);
//
//        ResponseEntity<ObjectModel> response = objectController.saveObject(object);
//        ObjectModel responseObject = response.getBody();
//
//        assertEquals(object, responseObject);
//    }
//
//    @Test
//    public void deleteObject_DeletesObject() {
//        objectController.deleteObject(1);
//    }
//
//    @Test
//    public void deleteAllObjects_DeletesAllObjects() {
//        objectController.deleteAllObjects();
//    }
//}
