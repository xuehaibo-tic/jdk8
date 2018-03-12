package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/_InitialNameServiceImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u66/5298/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, November 9, 2015 10:52:06 AM PST
*/

public abstract class _InitialNameServiceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements com.sun.corba.se.spi.activation.InitialNameService, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _InitialNameServiceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("bind", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  // bind initial name
       case 0:  // activation/InitialNameService/bind
       {
         try {
           String name = in.read_string ();
           org.omg.CORBA.Object obj = org.omg.CORBA.ObjectHelper.read (in);
           boolean isPersistant = in.read_boolean ();
           this.bind (name, obj, isPersistant);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBoundHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:activation/InitialNameService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _InitialNameServiceImplBase
