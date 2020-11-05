package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException; 
import pt.tecnico.po.ui.Input; 
import woo.core.StoreManager;  
//FIXME import other classes

/**
 * Show all clients.
 */
public class DoShowAllClients extends Command<StoreManager> {

  public DoShowAllClients(StoreManager storefront) {
    super(Label.SHOW_ALL_CLIENTS, storefront);
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
    Colection<Client> clients = _receiver.getAllClients();
    // colocar na ordem certa, ordem crescente de identificador

    for(Cliente cl : clients){
      _display.addLine(cl.toSting());
    }
    _display.display();
  }
}
