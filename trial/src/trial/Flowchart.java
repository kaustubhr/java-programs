package trial;

public class Flowchart {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float avg;
		avg = a/3 + b/3 + c/3;
		System.out.println("avg = "+avg);
		if(avg>a && avg>b && avg>c) {
			System.out.println("Average is higher than a,b,c");	
			return;
		}
		else {
			if(avg>a && avg>b) {
				System.out.println("avg is higher than a,b");
				return;
			}
			else {
				if(avg>a && avg>c) {
					System.out.println("avg is higher than a,c");
					return;
				}
				else {
					if(avg>b && avg>c) {
						System.out.println("avg is higher than b,c");
						return;
					}
					else {
						if(avg>a) {
							System.out.println("avg is just higher than a");
							return;
						}
						else {
							if(avg>b) {
								System.out.println("avg is just higer than b");
								return;
							}
							else {
								if(avg>c) {
									System.out.println("avg is just higer than c");
									return;
								}
								else {
									return;
								}
							}
						}
					}
				}
			}
		}
	}

}
