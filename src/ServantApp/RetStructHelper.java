package ServantApp;


/**
* ServantApp/RetStructHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Servant.idl
* 18 ������� 2018 �. 5:55:54 MSK
*/

abstract public class RetStructHelper
{
  private static String  _id = "IDL:ServantApp/RetStruct:1.0";

  public static void insert (org.omg.CORBA.Any a, ServantApp.MyStruct that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ServantApp.MyStruct extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ServantApp.MyStructHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ServantApp.RetStructHelper.id (), "RetStruct", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ServantApp.MyStruct read (org.omg.CORBA.portable.InputStream istream)
  {
    ServantApp.MyStruct value = null;
    value = ServantApp.MyStructHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ServantApp.MyStruct value)
  {
    ServantApp.MyStructHelper.write (ostream, value);
  }

}
