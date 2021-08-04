package Business;

public class JUnitmessage {
	String m;
    JUnitMessage(String msg)
    {
        m=msg;
    }
String printMessage()
{
    return m;
}

String printHiMessage()
{
    return "Hi "+m;
}
}
