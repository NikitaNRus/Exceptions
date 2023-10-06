package Seminars.Sem3.Task2;

class Counter implements AutoCloseable{
    private Integer count;

    Counter(){
        this.count =0;
    }

    public Integer getCount() {
        if (this.count == null){
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        }
            return count;
    }

    public void add() throws Exception{
        if (this.count == null){
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        }
            this.count++;
    }

    @Override
    public void close() throws Exception {
        if (this.count != null){
            this.count= null;
        }
        else{
            throw new UnsupportedOperationException("Unimplemented method 'close'");
        } 
    }
}


public class program {
    public static void main(String[] args) {
        try (Counter count = new Counter();) {
            count.add();
            System.out.println(count.getCount());
            count.close();
            count.add();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
