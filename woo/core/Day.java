package woo.core;

public class Day{

    public int _date;

    public Day(){
        _date = 0;
    }

    public int getDay(){
        return _date;
    }

    public void advanceDay(int days){
        _date = _date + days;
    }
}

