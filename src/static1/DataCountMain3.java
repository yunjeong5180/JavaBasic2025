package static1;

public class DataCountMain3
{
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count= " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count= " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 -> 권장x: 인스턴스 변수에 접근하는 것으로 착각하게 되기 때문에.
        // 코드를 짤때는 가져다 쓰는 입장에서 생각하면서 코드를 짜야 한다.
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
