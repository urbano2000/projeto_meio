package woo.app.main;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.core.StoreManager;
//FIXME import other classes

/**
 * Show current date.
 */
public class DoDisplayDate extends Command<StoreManager> {

  public DoDisplayDate(StoreManager receiver) {
    super(Label.SHOW_DATE, receiver);
  }

  @Override
  public final void execute() throws DialogException {

    //FIXME implement command
    int date = _receiver.getDate();
    //      |
    //      ^ metodo que devolve a data no StoreManager
    _display.popup(Message.currentDate(date));

  }

}
