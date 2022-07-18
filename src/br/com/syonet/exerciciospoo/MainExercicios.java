package br.com.syonet.exerciciospoo;

public class MainExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Professor professor = new Professor("Testeprof");
		professor.setFormacao("Física");
		System.out.println(professor.getNome());
		System.out.println(professor.getFormacao());
		
		Aluno aluno = new Aluno("Gabriel");
		aluno.setSobrenome("Fernandes");
		aluno.setIdade(25);
		System.out.println(aluno.insereDados());
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setTurno(1);
		disciplina1.setNome("Logica |");
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setTurno(2);
		disciplina2.setNome("BackEnd |");
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setTurno(3);
		disciplina3.setNome("FronEnd |");
		Aluno aluno1 = new Aluno("Aluno1");
		aluno.setSobrenome("Teste");
		aluno.setIdade(25);
		aluno.adicionaDisciplina(disciplina1);
		aluno.adicionaDisciplina(disciplina2);
		aluno.adicionaDisciplina(disciplina3);
		
		System.out.println(aluno.insereDados());
		System.out.println("----");
		System.out.println(aluno1.insereDados());
	}

}
