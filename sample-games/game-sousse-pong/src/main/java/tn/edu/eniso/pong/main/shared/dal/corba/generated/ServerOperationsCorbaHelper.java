package tn.edu.eniso.pong.main.shared.dal.corba.generated;


/**
 * tn/edu/eniso/pong/main/shared/dal/corba/generated/ServerOperationsCorbaHelper.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from DalCorba.idl
 * Tuesday, December 20, 2011 11:10:02 PM CET
 */

abstract public class ServerOperationsCorbaHelper {
    private static String _id = "IDL:ConnectorCorba/ServerOperationsCorba:1.0";

    public static void insert(org.omg.CORBA.Any a, tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = org.omg.CORBA.ORB.init().create_interface_tc(tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorbaHelper.id(), "ServerOperationsCorba");
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba read(org.omg.CORBA.portable.InputStream istream) {
        return narrow(istream.read_Object(_ServerOperationsCorbaStub.class));
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba value) {
        ostream.write_Object((org.omg.CORBA.Object) value);
    }

    public static tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba narrow(org.omg.CORBA.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba)
            return (tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba) obj;
        else if (!obj._is_a(id()))
            throw new org.omg.CORBA.BAD_PARAM();
        else {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            tn.edu.eniso.pong.main.shared.dal.corba.generated._ServerOperationsCorbaStub stub = new tn.edu.eniso.pong.main.shared.dal.corba.generated._ServerOperationsCorbaStub();
            stub._set_delegate(delegate);
            return stub;
        }
    }

    public static tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba unchecked_narrow(org.omg.CORBA.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba)
            return (tn.edu.eniso.pong.main.shared.dal.corba.generated.ServerOperationsCorba) obj;
        else {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            tn.edu.eniso.pong.main.shared.dal.corba.generated._ServerOperationsCorbaStub stub = new tn.edu.eniso.pong.main.shared.dal.corba.generated._ServerOperationsCorbaStub();
            stub._set_delegate(delegate);
            return stub;
        }
    }

}
