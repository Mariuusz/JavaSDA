import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.Pet;
import pl.sda.Zoo;

//import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ZooTests {
    private Pet pet;

    @Before
    public void setUp() {
        pet = new Pet();
    }

    @Test
    public void getPetNames_defaultCostructor_emptyString() {
        String expected = "";

        String actual = new Zoo().GetPetNames();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void getPetNames_addNullPointerException() {
        Zoo zoo = new Zoo();

        zoo.GiveHomelessPet(null);

        zoo.GetPetNames();

    }

        @Test
    public void getFirstPetNames_List()
    {
        String expected = "Toffik";

        Zoo zoo = new Zoo();
    // dodałem sobie konstruktor z imieniem
        Pet pet1 = new Pet("Toffik");

        zoo.GiveHomelessPet(pet1);

        String actual = zoo.GetPetNames();

        assertEquals(expected,actual);
    }
    @Test
    public void getPetNames_add2PetsTofikFafik_ToffikFaffik() {
        String expected = "TofikFafik";

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        pet1.setName("Tofik");
        pet2.setName("Fafik");

        Zoo zoo = new Zoo();
        zoo.GiveHomelessPet(pet1);
        zoo.GiveHomelessPet(pet2);

        assertEquals(expected, zoo.GetPetNames());
    }

    @Test
    public void takePet_add1PettTake1Pet_Null(){
        String expected = "";

        Pet pet1 = new Pet();

        pet1.setName("Tofik");

        Zoo zoo = new Zoo();
        zoo.GiveHomelessPet(pet1);

        zoo.TakePet(pet1);

        assertEquals(expected,zoo.GetPetNames());
    }

    @Test
    public void test(){
        Pet pet = new Pet();
        pet.setName("Tofik");
        assertThat(pet.getName()).isEqualTo("Tofik");         // najpi
        assertThatExceptionOfType(IllegalStateException.class);
    }
    @Test
    public void bmi_weihht1height1_1(){
        double expected = 1;

        Pet pet = new Pet();
        pet.setWeight(1);
        pet.setHeight(1);


        double actual = pet.getBMI();
//        Assert.assertEquals(expected, actual);    // nie można porównywać typów double!!!!!!!
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = IllegalStateException.class)
    public void getBMI_waga0wys0_IllegalStateException(){
        pet.setHeight(-1);


        pet.getBMI();
    }

    @Test(expected = IllegalStateException.class)
    public void getBMI_weight0Height0_IllegalStateException(){
        Pet pet = new Pet();

        pet.getBMI();
        // assertThat

    }
    @Test(expected = IllegalStateException.class)
    public void getBMI_waga_1wys1_IllegalStateException(){
        pet.setHeight(1);
        pet.setWeight(-1);

        pet.getBMI();
    }
    @Test(expected = IllegalStateException.class)
    public void getBMI_waga_0wys1_IllegalStateException(){
        pet.setHeight(1);
        pet.setWeight(-1);

        pet.getBMI();
    }
    @Test
    public void getBMI_weight20_height2_5(){
        double expected = 5.0;
        pet.setWeight(20.0);
        pet.setHeight(2.0);

        double actual = pet.getBMI();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getWeight_weight1feed10_11(){
        double expected = 11.0;
        pet.setWeight(1);

        pet.feed(10.0);

        assertThat(pet.getWeight()).isEqualTo(expected);
    }

    @Test
    public void verifyCallGetNames(){
        Zoo zooMock = mock(Zoo.class);
        zooMock.GetPetNames();

        verify(zooMock).GetPetNames();
//        verify(zooMock, times(2)).GetPetNames();
    }

    @Test
    public void verifyCallGiveHomelessPet(){
        Zoo zooMock = mock(Zoo.class);
        zooMock.GiveHomelessPet(null);

        verify(zooMock).GiveHomelessPet(null);
    }

    @Test
    public void getPetNames_mockedZooAddPropperPetTofikWhenFafik_Fafik(){
        Zoo zooMock = mock(Zoo.class);
        Pet pet = new Pet();
        pet.setName("Tofik");
        zooMock.GiveHomelessPet(pet);

        when(zooMock.GetPetNames()).thenReturn("Fafik");

        assertThat("Fafik").isEqualTo(zooMock.GetPetNames());
    }

//    @Test
//    public void zwrocwartosc_getBMI(){
//        Pet petMock = mock(Pet.class);
//        petMock.getBMI();
//
//        when(petMock.getBMI()).thenReturn(1.0);
//
//        assertThat(1.0).isEqualTo(petMock.getBMI());
//
//    }

    @Test
    public void trzeciPunkt(){
        Zoo zoo = new Zoo();
        Pet petMock = mock(Pet.class);
        zoo.GiveHomelessPet(petMock);
        zoo.GetPetNames();

        verify(petMock, times(1)).getName();
    }

//    @Test
//    public void czwarte(){
//        Pet petMock = mock(Pet.class);
//        when(petMock.getName()).thenReturn("Fafik");
//        Zoo zoo = new Zoo();
//        zoo.GiveHomelessPet(petMock);
//        zoo.GiveHomelessPet(petMock);
//
//        verify(zoo, times(1)).GetPetNames();
//
//
//    }
}
