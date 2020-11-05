package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.core.StoreManager;
//FIXME import other classes

/**
 * Register new client.
 */
public class DoRegisterClient extends Command<StoreManager> {

  private Input<String> _id;
  private Input<String> _name;
  private Input<String> _adress;

  public DoRegisterClient(StoreManager storefront) {
    super(Label.REGISTER_CLIENT, storefront);
    //FIXME init input fields
    _id = _form.addStringInput(Message.requestClientKey());
    _name = _form.addStringInput(Message.requestClientName());
    _adress = _form.addStringInput(Message.requestClientAddress());
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
    _form.parse();
    Client client = _receiver.compareClient(_id.value());
    throw new ( DuplicateClientKeyException(_id.value()));
  }

}
