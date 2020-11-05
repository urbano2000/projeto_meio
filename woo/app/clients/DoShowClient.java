package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.core.StoreManager;
//FIXME import other classes

/**
 * Show client.
 */
public class DoShowClient extends Command<StoreManager> {

  private Input<String> _clientKey;// input que vamos receber

  public DoShowClient(StoreManager storefront) {
    super(Label.SHOW_CLIENT, storefront);
    //o input esta associado a pergunta do form
    _clientKey = _form.addStringInput(Message.requestClientKey());

  }

  @Override
  public void execute() throws DialogException {
    _form.parse(); //para correr efetivamente as perguntas
    //FIXME implement command

    try{
      Client cl = _receiver.getClient(_clientKey.value());
      _display.popup(cl.toString);

    } catch(sbjvdc e){
      throw new (UnkownClientKeyException(_clientKey.value()));
    }
  }

}
