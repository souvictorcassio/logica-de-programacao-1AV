import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int cont_t, quant_t, cont_d, quant_d, cont_a, quant_a = 0, quant_apv = 0, quant_fin = 0, quant_rep = 0;
    
    float av1, av2, media, somaMedia = 0, somaMediaDisciplina = 0, somaMediaTurma = 0, mediaGeralDisciplina = 0, mediaGeralTurma = 0, maiorMedia = 0, menorMedia = 0;
    
    System.out.println("Bem-vindo!");
    System.out.println("");
    
    System.out.print("Informe o quantitativo de turmas: ");
    quant_t = in.nextInt();

    //contador de turmas
    for (cont_t = 1; cont_t <= quant_t; cont_t++){
      quant_d = 0;
      somaMediaTurma = 0;
      
      System.out.printf("Informe a quantidade de disciplinas da turma "+cont_t+": ");
      quant_d = in.nextInt();

      //contador de disciplinas
      for (cont_d = 1; cont_d <= quant_d; cont_d++){
        somaMedia = 0;
        quant_a = 0;
        quant_rep = 0;
        quant_fin = 0;
        quant_apv = 0;

        System.out.println("-------------------------------------------------");
        System.out.print("Informe o nome da disciplina: ");
        String disciplina = in.next();
        System.out.printf("Informe a quantidade de alunos da disciplina "+disciplina+": ");
        quant_a = in.nextInt();

        //processamento de notas e medias
        for (cont_a = 1; cont_a <= quant_a; cont_a++){
          somaMediaDisciplina = somaMediaDisciplina + somaMedia;
          
          System.out.printf("Digite a primeira nota do aluno "+cont_a+": ");
          av1 = in.nextFloat();
          System.out.printf("Digite a segunda nota do aluno "+cont_a+": ");
          av2 = in.nextFloat();

          media = (av1 + av2)/2;
          
          if (media > maiorMedia || cont_a == 1){
            maiorMedia = media;
          }

          if (media < menorMedia || cont_a == 1){
            menorMedia = media;
          }
          
          if(media < 4){
            quant_rep = quant_rep + 1;
          } else if(media < 7 && media >= 4){
            quant_fin = quant_fin + 1;
          } else {
            quant_apv = quant_apv + 1;
          }

          somaMedia = somaMedia + media;
          mediaGeralDisciplina = somaMedia / quant_a;
          
        }

      somaMediaTurma = somaMediaTurma + mediaGeralDisciplina;

      //relatorio de disciplinas
      System.out.println("");
      System.out.println("#### RESUMO DA DISCIPLINA - "+disciplina+" ####");
      System.out.println("");
      System.out.println("Quantidade de alunos da disciplina "+disciplina+": "+quant_a);
      System.out.println("A média geral da disciplina foi: "+mediaGeralDisciplina);
      System.out.println("A maior média da turma foi: "+maiorMedia);
      System.out.println("A menor média da turma foi: "+menorMedia);
      System.out.println("Alunos reprovados: "+quant_rep+"!");
      System.out.println("Alunos na final: "+quant_fin+"!");
      System.out.println("Alunos aprovados: "+quant_apv+"!");
      System.out.println("-------------------------------------------------");
      }
      
    
    mediaGeralTurma = somaMediaTurma / quant_d;

    //relatorio de turmas
    System.out.println("");
    System.out.println("#### RESUMO DA TURMA ####");
    System.out.println("");
    System.out.println("Turma "+cont_t);
    System.out.println("Quantidade de disciplinas: "+quant_d);
    System.out.println("Média geral da turma: "+mediaGeralTurma);
    System.out.println("-------------------------------------------------");
    }
  }
}