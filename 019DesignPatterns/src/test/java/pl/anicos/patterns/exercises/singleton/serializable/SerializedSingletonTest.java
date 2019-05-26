package pl.anicos.patterns.exercises.singleton.serializable;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertSame;

public class SerializedSingletonTest {

    @Test
    public void shouldDestroySinglton() {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        SerializedSingleton instanceTwo = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"))) {
            out.writeObject(instanceOne);


            //deserailize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            instanceTwo = (SerializedSingleton) in.readObject();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

        assertSame(instanceOne, instanceTwo);
    }
}