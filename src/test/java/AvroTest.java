import com.harper.testing.serde.Base;
import com.harper.testing.serde.Derive;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by harper on 4/23/18.
 */
public class AvroTest {
    File f = new File("test.base.avro");
    File fd = new File("test.derive.avro");

    //    @Test
    public void write() throws IOException {
        DatumWriter<Base> datumWriter = new SpecificDatumWriter<Base>();
        DataFileWriter<Base> dfw = new DataFileWriter<Base>(datumWriter);
        dfw.create(Base.getClassSchema(), f);
//        dfw.append(Base.newBuilder().setF1(1).setF2(10L).setF4("abc").build());
//        dfw.append(Base.newBuilder().setF1(2).setF2(10L).setF4("efg").build());
        dfw.close();
    }

//    @Test
    public void testRead() throws IOException {
        DatumReader<Base> dr = new SpecificDatumReader<>();
        DataFileReader<Base> dfr = new DataFileReader<>(f, dr);
        Base base = null;
        while (dfr.hasNext()) {
            base = dfr.next(base);
            System.out.println(base.toString());
        }
    }

//    @Test
    public void testDeriveWrite() throws IOException {
//        DatumWriter<Derive> datumWriter = new SpecificDatumWriter<>();
//        DataFileWriter<Derive> dfw = new DataFileWriter<>(datumWriter);
//        dfw.create(Derive.getClassSchema(), fd);
//        dfw.append(Derive.newBuilder().setF1(-1).setF12(Base.newBuilder().setF1(1).setF2("abc").build()).setF2("dabc").build());
//        dfw.append(Derive.newBuilder().setF1(-2).setF12(Base.newBuilder().setF1(2).setF2("efg").build()).setF2("defg").build());
//        dfw.close();
    }

    @Test
    public void testDeriveRead() throws IOException {
        DatumReader<Derive> dr = new SpecificDatumReader<>();
        DataFileReader<Derive> dfr = new DataFileReader<>(fd, dr);
        Derive derive = null;
        while (dfr.hasNext()) {
            derive = dfr.next(derive);
            System.out.println(derive.toString());
        }
    }
}
