package java_fx.contactsapp;// Fig. 13.16: ImageTextCell.java
// Custom ListView cell factory that displays an Image and text
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class ContactTextCell extends ListCell<Contact> {
   private VBox vbox = new VBox(8.0); // 8 points of gap between controls
   private Label label = new Label();

   // constructor configures VBox, ImageView and Label
   public ContactTextCell() {
      vbox.setAlignment(Pos.CENTER); // center VBox contents horizontally


      label.setWrapText(true); // wrap if text too wide to fit in label
      label.setTextAlignment(TextAlignment.CENTER); // center text
      vbox.getChildren().add(label); // attach to VBox

      setPrefWidth(USE_PREF_SIZE); // use preferred size for cell width
   }

   // called to configure each custom ListView cell
   @Override 
   protected void updateItem(Contact item, boolean empty) {
//       required to ensure that cell displays properly
      super.updateItem(item, empty);

      if (empty || item == null) {

      }
      else {
         label.setText(item.toString()); // configure Label's text
         setGraphic(vbox); // attach custom layout to ListView cell
      }
   }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
