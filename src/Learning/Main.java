package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;



public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        //sol.isValid("(){[]");
//        String[] strs = {"car","car","car"};
//        sol.longestCommonPrefix(strs);

        // LeetCode66 PlusOne
        //int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        //sol.plusOne(digits);

        int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = new int[]{1, 1};
        int[] nums3 = new int[]{1, 2};
        int[] nums4 = new int[]{1, 1, 2};
        int[] nums5 = new int[]{-3,-1,0,0};
        sol.removeDuplicatesMy(nums4);
        sol.removeDuplicatesOther(nums4);

//        Types(); //метод с типами
//        Conditions(); //метод с условными конструкциями
//        Cycles(); //метод с циклами
//        Arrays (); //метод с разными массивами
//
//        Incapsulation inc = new Incapsulation();
//        inc.setGet();

    }

    public static void Types() {
        int integ = 30;                //явное приведение инт в дабл
        integ = 31;                    //модификатор final перед переменной - защищает значение от изменения
        double dbl = (double) integ;   //тип переменной var как бы без типа, он определяется сам при присвоении значения
//        System.out.println(dbl);

        double dbl2 = 40.99;           //явное (+сужающее!) приведение дабл в инт - округление в меньшую сторону до целых
        int integ2 = (int)dbl2;
//        System.out.println(integ2);

        Integer obertkaInt = 777;
        int primitivInt = 777;
        boolean isEqualInt = obertkaInt.equals(primitivInt);
//        System.out.println(isEqualInt);
        //равны (примитив инт и класс-обертка Интеджер) но надо помнить, что значение по умолчанию у классов null

        String numStr = "9999";
        int numInt = Integer.parseInt(numStr); //почему-то здесь называют парсингом, хотя по мне конвертация или приведение
//        System.out.println(numInt);

        int intA = 5; int IntB = 6; byte byteA = 7; byte byteB = 8;
        int maxInt = Integer.max(intA, IntB); //один их методов для классов-оберток
//        System.out.println(maxInt);
        System.out.println(MaxValues(byteA,byteB)); //just call some method

        Long llllong = 10L;
        short sssssshort = llllong.shortValue();
        int iiiiint = (int)sssssshort;
//        System.out.println(iiiiint);

        int a = 20; int b = 10;
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;
        a = ++a;
        a = a++;

        double b2 = 16.5 / 2.5;
        b2 = b2/2;
//        System.out.println(++b2);
    }

    public static void Conditions() {

        int number = 1;   //шифт ф6 - очень удобно переименовывать переменные
        String line;
        if (number == 1) {
            line = "one";
        } else if (number == 2) {
            line = "two";
        } else {
            line = "other";
        }



        line = number > 0 ? "not null" : "null"; //тернарный оператор строится так
        //условие ? если истина : если ложь
        //по сути короткий иф-элс

        switch (line) { //длинный обычный свитч
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            default:
                number = 3;
        }

        number = switch (line) { //short switch with getting a value to the variable
            case "one" -> 1;
            case "two" -> 2;
            default -> 3;
        };

        switch (number) {
            case 1:
            case 2:
            case 3:
                line = "1-3"; //одинаковый результат соответствует одному из нескольких условий
            case 4:
            case 5:
            case 6:
                line = "4-6"; //одинаковый результат соответствует одному из нескольких условий
        }
    }

    public static int MaxValues (byte valA, byte valB) {
        return Integer.max((int) valA,(int) valB); //один их методов для классов-оберток
    }

    public static void Cycles() {

        for (int i = 0; i < 3; i++) {int one = 1;} //the most simple cycle

        int[] massiveIntVal = new int[]{1, 2, 3, 4, 5};
        int i = 0;
        while (i < massiveIntVal.length) {      //order search of items with WHILE
            i++;
            int one = 1;
        }

        for (int j: massiveIntVal) { int one = 1;} //order search of items with FOR
    }

    static void Arrays() {
        int[] massiveIntNull = new int[5];               //don't lose knowledge about massive
        int[] massiveIntVal = new int[]{1, 2, 3, 4, 5};
        int[][] arrayArray = new int[3][];
        arrayArray[0] = massiveIntVal;
//        int[] massiveInt = {1, 2, 3, 4, 5};
        ArrayList[] massWithArr= new ArrayList[3];

        //классы, которые могут работать с разными типами - дженерики (например, список)
        //в списках можно хранить только классы (ссылочные типы) (примитивы заменяются обертками)
        //it's necessary to import java.util.ArrayList class
        ArrayList<Double> listDbl = new ArrayList<>();
        listDbl.add(32.2); //add an element in end of the list
        listDbl.add(0, 1.1); //add an element in def index. Items which after will shift up
        listDbl.add(2, 3.3);
        listDbl.contains(3.3); //isContain the list this item?
        listDbl.remove(1); //on index or on item value
        listDbl.clear();
        listDbl.isEmpty();

        int listSize = listDbl.size();
        for (Double exp : listDbl) {
//            System.out.println(exp);
        }

        HashMap<String, Integer> kartaHesh;
            //and
            kartaHesh = new HashMap<>();
            //or
            kartaHesh = new HashMap<String, Integer>();
        //or
        HashMap<String, Integer> kartaHesh2 = new HashMap<>();
        kartaHesh2.put("key1", 111);
        kartaHesh2.put("key2", 112);
        kartaHesh2.put("key3", 113);
        int getValueFromHashMap = kartaHesh2.get("key2");
        kartaHesh2.values();
        kartaHesh2.keySet();
        kartaHesh2.remove("key3");
        kartaHesh2.containsKey("key1");
        kartaHesh2.containsValue(111);
        kartaHesh2.clear();



        HashMap<Integer, int[]> hashMapWithArray = new HashMap<>();
        int[] arrayInt = new int[30];
        hashMapWithArray.put(1,arrayInt);
        int[] tempArray = hashMapWithArray.get(1);
        tempArray[0] = 3000;
        tempArray[1] = 4000;
        int uuu = tempArray.length;
    }

    } //конец класса Мэйн

class Rat { //собственно класс рэт, его экземпляры буде создавать, и подклассы
    String name;
    double age;
    private String privateRat = "secret haha";

    public String getPrivateRat () { //геттер для приватного поля
        return privateRat;
    }
    public void setPrivateRat (String secretRat) { //сеттер для приватного поля
        if (secretRat != "") //логика проверки нового значения
            privateRat = secretRat;
    }

    public Rat() {
        System.out.println("Это конструктор без парам, он вызовется в другом конструкторе тут же");
    }

    public Rat (String name, double age) { //конструктор, обязывает при создании экз указывать все аргументы в скобках
        this(); //вот тут вызывается первый конструктор бещ парам-в
//        name = newName;
//        age = newAge;
        //либо же, better!!!
        this.name = name;
        this.age = age;
    }


} //конец класса рэт

class OwrRats {
    int tailLenght;
    double ratAge;
    String ratName;

    public OwrRats(Rat rat, int tailLenght) { //конструктор может принимать сразу объект, потом инициализируются поля
        this.ratAge = rat.age;
        this.ratName = rat.name;
        this.tailLenght = tailLenght;
    }


    public static void MyRats() {

        Rat RatRocket = new Rat("Rocket",1.1); //экземпляры класса рэт, задаю для них инд значения
        System.out.println(RatRocket.name + " " + RatRocket.age);

        Rat RatVishnya = new Rat("Vishnya",1.3);
        System.out.println(RatVishnya.name + " " + RatVishnya.age);

        Rat RatHolly = new Rat("Holly",1.2);
        System.out.println(RatHolly.name + " " + RatHolly.age);
    }

}
class Incapsulation {
        //объединение методов и аргументов для какой-то задачи в один класс/метод
        //модификаторы доступа - приват, пекедж-приват (дефолт), протектед, паблик
        //геттеры и сеттеры (для приватных полей)
        Rat tarryRat = new Rat("Tarry", 2); //создали экз класса для опробования гет и сет
        public void setGet() {
            System.out.println(tarryRat.getPrivateRat());
            tarryRat.setPrivateRat("ololo");
            System.out.println(tarryRat.getPrivateRat());
        }

    }

class Inheritance {
    protected int weight;
    protected boolean isWild;

    public Inheritance(int weightNew, boolean isWildNew) { //constructor, name matches with name class
        weight = weightNew;
        isWild = isWildNew;
    }

    public String Say() {
        return "her morzhovy";
    }
}

class Nasledovanie extends Inheritance {
        protected boolean isPredator;
        //можно использовать методы и поля подклассов напрямую, можно объявлять новые поля и методы
        protected boolean isWild; //сокрытие (hiding) - объявление в подклассе поля с таким же именем, как и в суперклассе
        //можно переопределять методы (с тем же именем, но другим поведением)
        //очень милый котик папа Дима мама Ира брат Кир брат Вася Ася вщоывные Крияиа

        public Nasledovanie () {
            //вызов конструктора суперкласса из конструктора подкласса (ПЕРВОЙ СТРОКОЙ)
            super(100, false);
        }
        public String Mew() {
            isWild = false; //эта переменная будет либо наследованной из Interhance либо локальной depends of hiding
            return "Ася ася ася 333";
        }
    }

class Sledovanie extends Nasledovanie { //this class has all arguments anf methods of classes-parents КРОМЕ ПРИВАТНЫХ
    protected String color;       //это подкласс, а класс-предков и класс-родитель - суперклассы
                //аннотации @Override переопределение метода в подклассе, @Deprecated устаревший метод
}

class Teacher {
    int workload;
    Object anyObject;

    void setObject() { //класс объект - родитель для всех классов по умолчанию
        anyObject = new Rat("rat1", 1);//а еще ему можно присваивать другие классы

        Rat[] ratsBand = { new Rat("rat1", 1), new Rat("rat2", 2)};
        anyObject = ratsBand; //массив объектов

        anyObject = new int[] {1,2,3,4,5};

        anyObject = 123; //инт и другие примитивы преобразуются в обертки

        anyObject = "стринг класс";
    }
   protected String StartLesson () {
       return "достать учебники";
   }

   public Teacher() {
       //если в классе-родителе есть конструктор без параметров, то конструктор подкласса он вызовется автоматически, неявно
       workload = 10;
   }

   int sizeOfArray (Object[] anyArray) { //в качестве параметра массив любого типа
        int count = 0;
        for (Object o: anyArray) {
            count++;
       }
        return count;           //подсчитывается количество элементов в массиве
   }
}

class GeographyTeacher extends Teacher {
    int countLabs;
    @Override                           //аннотация для визуального удобства и отслеж. ошибки при изменении сигнатуры
    public String StartLesson() {       //метод стал публичным, расширилось поле определения
        super.StartLesson(); //ключевое "супер" вызывает метод класса-родителя (не другого предка) внутри подкласса
        //таким же образом можно обращаться к скрытым переменным (не приватным, а которые были ПЕРЕопределены в подклассе)
        return "достать у222";      //изменилось поведение
    }

    public GeographyTeacher() {
        //неявно вызывается конструктор из Teacher
        super(); //но его можно вызвать и явно (тогда по контрол+щелчок можно перейти к определению)
        //если же в суперклассе конструктор с параметрами, то его обязательно вызвать в конструкторе подкласса
                                      //через супер(параметры)
        countLabs = 2; //а workload взялось из суперкласса в любом случае
    }
}

class GenerateCod {
    int num1;
    int num2;
    boolean isno;
    public String[] vaffels;

    public GenerateCod(int num1, int num2, boolean isno) {
        this.num1 = num1;
        this.num2 = num2;
        this.isno = isno;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void Action() {
        num1 += num2;
    }


    @Override
    public boolean equals(Object o) { //автосгенерированный эквалс
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenerateCod that = (GenerateCod) o;
        return num1 == that.num1 && num2 == that.num2 && isno == that.isno && Arrays.equals(vaffels, that.vaffels);
    }

    @Override
    public int hashCode() {       //автосгенерированный хэшкод
        int result = Objects.hash(num1, num2, isno);
        result = 31 * result + Arrays.hashCode(vaffels);
        return result;
    }

    @Override
    public String toString() {     //автосгенерированный туСтринг
        return "GenerateCod{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", isno=" + isno +
                ", vaffels=" + Arrays.toString(vaffels) +
                '}';
    }
}

class GenerateCod2 extends GenerateCod {

    public GenerateCod2(int num1, int num2, boolean isno) {
        super(num1, num2, isno);
    }

    @Override
    public void Action() {
        super.Action(); //наверное, можно и не вызывать метод суперкласса. А можно и вызвать
        if (isno) num2 = 0; //добавили функционал переопределенному методу
    }


}

class overrideEqualsClass {
    public String str;
    public int integ;

    public overrideEqualsClass(String str, int integ) {
        this.str = str;
        this.integ = integ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                          //эти три проверки надо делать обязательно
        if (obj == null) return false;                         //при переопределении эквалса
        if (this.getClass() != obj.getClass()) return false;
        overrideEqualsClass anyClass = (overrideEqualsClass) obj; //привели обдж к текущему классу для доступа к его полям
        return Objects.equals(str, anyClass.str) && //проверяем все поля с помощью ObjectS! equals(pole,pole)
                (integ == anyClass.integ);           //а для примитивов простое ==
    }

    @Override
    public int hashCode() {
        //при переопределении эквалса, надо переопределить и хэшкод таким вот образом
        return Objects.hash(str, integ);
    }
    //чтобы искать экземпляр класса в списке (contains()), обязательно нужно переопределить эквалс,
    //а чтобы искать в хэшмапе (containsKey()), еще и хэшкод


    @Override
    public String toString() { //переопределяем тустринг от австралопитека обджект для понятного получения информации
        return str + integ; //можно просто вывести переменные
        //а вообще надо "имя класса {поле 1 = значение, поле2 = значение и тд}"
        //в этом методе только чтение
        //только важные поля
        //поддерживать актуальность
        //если в переменной много информации, можно выводить её длину/размер, но перед этим проверять что оно не нулл
        //если в числе полей есть массив, то использовать Arrays.toString(массив)
        //для примитивов и оберток переопределять туСтринг не надо
        //при конкатенации + вызывает туСтринг
    }

}

class testOverrideEquals {
    String piska = "piska";
    int integ = 20;

    overrideEqualsClass class1 = new overrideEqualsClass(piska, integ);
    overrideEqualsClass class2 = new overrideEqualsClass(piska, integ);

    public boolean testEquals() {
        return class1.equals(class2); //тест переопределенного метода сравнения классов
    }
}