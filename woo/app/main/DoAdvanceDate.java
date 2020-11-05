package woo.app.main;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;
import woo.core.StoreManager;
//FIXME import other classes

/**
 * Advance current date.
 */
public class DoAdvanceDate extends Command<StoreManager> {

  //FIXME add input fields
  private Input<Integer> _days_to_advance;

  public DoAdvanceDate(StoreManager receiver) {
    super(Label.ADVANCE_DATE, receiver);
    _days_to_advance = _form.addIntegerInput(Message.requestDaysToAdvance());

  }

  @Override
  public final void execute() throws DialogException {

    _form.parse();
    //FIXME implement command
    //
    if (_days_to_advance.value() < 0) {
      throw new InvalidDateException(_days_to_advance);
    }
    _receiver.advanceDay(_days_to_advance.value());

  }
}
