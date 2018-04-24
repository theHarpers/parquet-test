import com.harper.testing.serde.Base;
import com.harper.testing.serde.Base2;
import com.harper.testing.serde.Base3;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.specific.SpecificData;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.avro.AvroReadSupport;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.ParquetWriter;
import org.junit.Test;

import java.io.IOException;


/**
 * Created by harper on 4/23/18.
 */
public class ParquetTest {
    Path p = new Path("test.avro.parquet");

    private void rm(Path p) throws IOException {
        FileSystem fs = FileSystem.get(new Configuration());
        if (fs.exists(p)) {
            fs.delete(p, true);
        }
    }

    //    @Test
    public void testWrite() throws IOException {
        rm(p);
        ParquetWriter<Base> w = AvroParquetWriter.<Base>builder(p).withSchema(Base.getClassSchema()).build();
        w.write(Base.newBuilder().setF1(1)
//            .setF2(10L)
//            .setF3("Hello")
            .build());
        w.write(Base.newBuilder().setF1(2)
//            .setF2(20L)
//            .setF3("World")
            .build());
        w.close();
    }

    @Test
    public void testRead() throws IOException {
        Configuration conf=new Configuration();
        AvroReadSupport.setAvroReadSchema(conf,Base3.getClassSchema());
        ParquetReader reader = AvroParquetReader.builder(p)
//            .withDataModel(new SpecificData())
            .withConf(conf)
            .build();

        for (int i = 0; i < 100; i++) {
            Base3 base = (Base3) reader.read();
//            GenericRecord base = (GenericRecord) reader.read();
            if (base == null) {
                break;
            }
//            System.out.println(base.getSchema());
            System.out.println(base.toString());
        }
    }
}