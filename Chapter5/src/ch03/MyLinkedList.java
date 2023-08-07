package ch03;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public MyListNode addElement( String data )
    {

        MyListNode newNode;
        if(head == null){  //맨 처음일때
            newNode = new MyListNode(data);
            head = newNode;
        }
        else{
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null)  //맨 뒤로 가서
                temp = temp.next;
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data )
    {
        int i;
        MyListNode tempNode = head; //작업 전 미리 원본리스트를 tempNode에 저장한다고 생각
        MyListNode preNode = null;
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count ){
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞으로 들어가는 경우
            newNode.next = head;
            head = newNode;
        }
        else{
            for(i=0; i<position; i++){ //position의 바로 앞까지
                preNode = tempNode; // 기존노드(tempNode)를 전노드에 넣어 옆으로 한칸씩 이동
                tempNode = tempNode.next; // 위와 같이 기존노드의 다음노드를 기존노드로 갈음.
                // 즉, 위의 코드는 i++과 같다고 생각하면 됨. 계속해서 다음 노드로 넘어가는 코드
            }
            newNode.next = preNode.next; //기존노드(preNode)의 다음껄 추가된 newNode와 연결
            preNode.next = newNode; //이전 노드를 새로 추가한 노드와 연결
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i;
        MyListNode tempNode = head;
            MyListNode preNode = null;

        if(position >= count ){
            System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞을 삭제하는
            head = tempNode.next;
        }
        else{
            for(i=0; i<position; i++){ //position의 바로 앞까지
                preNode = tempNode; //preNode를 찾아서
                tempNode = tempNode.next; //tempNode를 지운다
            }
            preNode.next = tempNode.next; //결국 preNode을 삭제한 노드의 next와 연결
        }
        count--; //한개를 삭제했으니 갯수를 빼줌.
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }

}