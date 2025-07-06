package Compareable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Task implements Comparable<Task>{
	String description;
	int priority;
	LocalDateTime deadline;
	
	public Task(String description,int priority,LocalDateTime deadline) {
		this.description=description;
		this.priority=priority;
		this.deadline=deadline;
	}
	
	public int compareTo(Task other) {
		
		if(this.priority!=other.priority) {
			return this.priority-other.priority;
		}else {
			return this.deadline.compareTo(other.deadline);
		}
	}
	
	public String toString() {
		return String.format("Task: %-22s | Priority: %d | Deadline: %s", 
                description, priority, deadline);
	}
}

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Task> tasks = new ArrayList<>();

		tasks.add(new Task("Fix security bug", 1, LocalDateTime.of(2024, 7, 1, 9, 0)));
		tasks.add(new Task("Prepare presentation", 2, LocalDateTime.of(2024, 7, 1, 10, 30)));
		tasks.add(new Task("Team meeting", 2, LocalDateTime.of(2024, 7, 1, 9, 30)));
		tasks.add(new Task("Update documentation", 3, LocalDateTime.of(2024, 7, 2, 14, 0)));
		tasks.add(new Task("Code review", 1, LocalDateTime.of(2024, 7, 1, 14, 0)));
		tasks.add(new Task("Deploy new version", 2, LocalDateTime.of(2024, 6, 30, 16, 0)));
		tasks.add(new Task("Write unit tests", 3, LocalDateTime.of(2024, 7, 1, 17, 0)));
		
		Collections.sort(tasks);
		
		for(int i=0;i<tasks.size();i++) {
			System.out.println("#"+(i+1)+" "+tasks.get(i));
		}
	}

}
