package woo.app.suppliers;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.core.StoreManager;
//FIXME import other classes

/**
 * Show all suppliers.
 */
public class DoShowSuppliers extends Command<StoreManager> {

  //FIXME add input fields

  public DoShowSuppliers(StoreManager receiver) {
    super(Label.SHOW_ALL_SUPPLIERS, receiver);
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
    Colection<Supplier> suppliers = _receiver.getAllSuppliers();
    // colocar na ordem certa, ordem crescente de identificador

    for(Supplier sup : suppliers){
      _display.addLine(sup.toSting());
    }
    _display.display();
  }
}
