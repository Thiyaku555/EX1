class Equalsmethod1 {

    String name;
    String id;
    String email;

    
    


    Equalsmethod1(){}





    public Equalsmethod1(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }





    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }





    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equalsmethod1 other = (Equalsmethod1) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    


   



}







    public  class Equalsmethod{
        public static void main(String[] args) {
            Equalsmethod1 eq1=new Equalsmethod1("abc","uu","er");
            Equalsmethod1 eq2=new Equalsmethod1("abc","uu","er");


            if(eq1.equals(eq2))
            {
                System.out.println("true");
            }
            else{
                System.out.println(false);
            }


        }
    
    }