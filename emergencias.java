import java.util.*;
public class Emergencias {
	public static void main(String[] args){
		Comparator<paciente> comparador = new paciente();
		PriorityQueue<paciente> listaPaciente = new PriorityQueue<paciente>(10, comparador);
		
		listaPaciente.add(new paciente("Carlos", "Dolor", "D"));
		listaPaciente.add(new paciente("Juan", "Gripe", "C"));
		listaPaciente.add(new paciente("Chris", "Herida", "B"));
		listaPaciente.add(new paciente("Pedro", "Hambre", "A"));
		listaPaciente.add(new paciente("Diego", "Nada", "E"));
		listaPaciente.add(new paciente("Mario", "Sangrado", "B"));
		listaPaciente.add(new paciente("Luis", "Mareo", "A"));
		
		System.out.println("Orden de emergencia de pacientes: ");
		while(true){
			paciente actualPaciente = listaPaciente.poll();
			if(actualPaciente == null) break;
			System.out.println(actualPaciente.toString());
		}
	}
}
