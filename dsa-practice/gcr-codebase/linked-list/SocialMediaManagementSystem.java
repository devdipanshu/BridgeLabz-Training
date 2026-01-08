class FriendNode {
	int friendId;
	FriendNode next;

	FriendNode(int friendId) {
		this.friendId = friendId;
	}
}

class UserNode {
	int userId;
	String name;
	int age;
	FriendNode friendHead;
	UserNode next;

	UserNode(int userId,String name,int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
}

public class SocialMediaManagementSystem {
	public static UserNode head = null;
	public void addUser(UserNode node) {
		if(head==null) {
			head = node;
		} else {
			UserNode temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void addFriend(int userId,int friendId) {
		UserNode temp = head;
		UserNode user = null;
		UserNode friend = null;
		while(temp!=null) {
			if(temp.userId == userId) {
				user = temp;
			}
			if(temp.userId == friendId) {
				friend = temp;
			}
			temp = temp.next;
		}

		if(user==null || friend==null) {
			return;
		}

		FriendNode f1 = new FriendNode(friendId);
		f1.next = user.friendHead;
		user.friendHead = f1;

		FriendNode f2 = new FriendNode(userId);
		f2.next = friend.friendHead;
		friend.friendHead = f2;
	}

	public void removeFriend(int userId,int friendId) {

		UserNode temp = head;

		while(temp!=null) {

			if(temp.userId == userId) {
				FriendNode f = temp.friendHead;
				if(f!=null && f.friendId == friendId) {
					temp.friendHead = f.next;
				} else {
					while(f!=null && f.next!=null) {
						if(f.next.friendId == friendId) {
							f.next = f.next.next;
							break;
						}
						f = f.next;
					}
				}
			}

			if(temp.userId == friendId) {
				FriendNode f = temp.friendHead;
				if(f!=null && f.friendId == userId) {
					temp.friendHead = f.next;
				} else {
					while(f!=null && f.next!=null) {
						if(f.next.friendId == userId) {
							f.next = f.next.next;
							break;
						}
						f = f.next;
					}
				}
			}

			temp = temp.next;
		}
	}

	public void displayFriends(int userId) {

		UserNode temp = head;

		while(temp!=null) {
			if(temp.userId == userId) {
				System.out.println("Friends of " + temp.name);
				FriendNode f = temp.friendHead;
				while(f!=null) {
					System.out.println("Friend ID: " + f.friendId);
					f = f.next;
				}
				return;
			}
			temp = temp.next;
		}
	}

	public void mutualFriends(int userId1,int userId2) {

		UserNode u1 = null;
		UserNode u2 = null;
		UserNode temp = head;

		while(temp!=null) {
			if(temp.userId == userId1) {
				u1 = temp;
			}
			if(temp.userId == userId2) {
				u2 = temp;
			}
			temp = temp.next;
		}

		if(u1==null || u2==null) {
			return;
		}

		FriendNode f1 = u1.friendHead;

		System.out.println("Mutual Friends:");

		while(f1!=null) {
			FriendNode f2 = u2.friendHead;
			while(f2!=null) {
				if(f1.friendId == f2.friendId) {
					System.out.println("Friend ID: " + f1.friendId);
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}
	}

	public void searchUserById(int userId) {

		UserNode temp = head;

		while(temp!=null) {
			if(temp.userId == userId) {
				System.out.println(temp.userId + " " + temp.name + " " + temp.age);
				return;
			}
			temp = temp.next;
		}
	}

	public void searchUserByName(String name) {

		UserNode temp = head;

		while(temp!=null) {
			if(temp.name.equalsIgnoreCase(name)) {
				System.out.println(temp.userId + " " + temp.name + " " + temp.age);
				return;
			}
			temp = temp.next;
		}
	}

	public void countFriends() {

		UserNode temp = head;

		while(temp!=null) {
			int count = 0;
			FriendNode f = temp.friendHead;
			while(f!=null) {
				count++;
				f = f.next;
			}
			System.out.println(temp.name + " has " + count + " friends");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		SocialMediaManagementSystem obj = new SocialMediaManagementSystem();

		obj.addUser(new UserNode(1,"Aman",21));
		obj.addUser(new UserNode(2,"Rohit",22));
		obj.addUser(new UserNode(3,"Neha",20));
		obj.addUser(new UserNode(4,"Pooja",23));
		obj.addFriend(1,2);
		obj.addFriend(1,3);
		obj.addFriend(2,3);
		obj.addFriend(2,4);
		obj.displayFriends(2);
		obj.mutualFriends(1,2);
		obj.countFriends();
		obj.removeFriend(1,3);
		obj.displayFriends(1);
	}
}
