import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ProgramC2
{
	public static void main(String[] args)
	{
		String[] colors={"MAGNA","RED","WHITE","BLUE","CYAN"};
		List<String>list = new ArrayList<String>();
		for(String color: colors)
			list.add(color);
		String[] removeColors={"RED","WHITE","BLUE"};
		List<String>removeList = new ArrayList<String>();
		for(String color:removeColors)
				removeList.add(color);
			System.out.println("ArrayList:");
		for(int count = 0;count<list.size();count++)
			System.out.printf("%s",list.get(count));
		removeColors(list,removeList);
		System.out.println("\n\nArrayList after calling removeColors");
		for(String color:list)
			System.out.printf("%s",color);
			System.out.print("\n");
	}
	private static void removeColors(Collection<String> collection1,Collection<String> collection2)
	{
		collection1.removeAll(collection2);
	}
}