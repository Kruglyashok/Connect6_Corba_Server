package ServantApp;

/**
* ServantApp/MyStructHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Servant.idl
* 18 ������� 2018 �. 5:55:54 MSK
*/

public final class MyStructHolder implements org.omg.CORBA.portable.Streamable
{
  public ServantApp.MyStruct value = null;

  public MyStructHolder ()
  {
  }

  public MyStructHolder (ServantApp.MyStruct initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServantApp.MyStructHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServantApp.MyStructHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServantApp.MyStructHelper.type ();
  }

}
