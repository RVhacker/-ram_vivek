
public class ProposalAcceptor {
   public void checkProposal(String name)
   {
	   if(name.equalsIgnoreCase("Katrinakaif"))
	   {
		   System.out.println("Accept the proposal");
	   }
     else
   {
	  throw new LoveException("Rejected!!!!"); 
   }
}
   public static void main(String[] args) {
	ProposalAcceptor p=new ProposalAcceptor();
	p.checkProposal("katrinakaif");
}
}
   