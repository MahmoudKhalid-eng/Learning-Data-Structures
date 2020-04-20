
package Stack;


public class Main {
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(4);// top = 4
        st.push(5);// top = 5
        st.pop(); // top  = 4
        st.push(6);// top = 6
        st.print();
    }
}
