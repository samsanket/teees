
public class StackImpl {


    public static void main(String[] args) {
        int arr[]= new int[10];
        final  int top=0;
        push(arr,10,top);
        pop(arr,top);
        boolean result=isEmptystack(top);

    }

    private static boolean isEmptystack(int top) {
        if (top==0){
            return false;
        }else
        {
            return true;
        }

    }

    private static void push(int[] arr, int i, int top) {
            arr[top]=i;
            top++;

    }

    private static void pop(int[] arr, int top) {
        arr[top]=0;
        top--;

    }
}

//top 4= ;
//hrader -> content type , authoriztion
//apiurl -> base path , v1 , / ? /
//requst body -> { }
//
//
//http -> statelaess ->  8080 :80
//https-> 443
//


//    react  < - >  spring
//
//    30 -> server;
//

//
//containers->
//nginx , clients , mvc

//user (name, role , uid)
//address(uidfk,city,state ,zip )
//
//get users whose role is manager and belong to kanartka ;

