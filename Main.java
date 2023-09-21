import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double a, b, va, vb, sa, sb, t;

        /****************************
            principais variáveis: 

            a = posição do trem A
            b = posição do trem B
            va = velocidade do trem A
            vb = velocidade do trem B
            s = posição final
            s0 = posição inicial
            t = tempo
        *****************************/

        System.out.println("\n\n--------- Colisão de Trens ---------");

        while (true){
            try{
                System.out.print("Deseja continuar o programa? \n[1] - sim \n[2] - não \nDigite: ");
                int resp = tec.nextInt();

                if (resp == 2) {
                    System.out.println("\nFIM DO PROGRAMA\n");
                    break;
                }

                System.out.print("\nPosicao do trem A: ");
                a = tec.nextInt();
        
                System.out.print("Velocidade do trem A: ");
                va = tec.nextInt();
        
                System.out.print("\nPosicao do trem B: ");
                b = tec.nextInt();
        
                System.out.print("Velocidade do trem B: ");
                vb = tec.nextInt();

                if (va >= 0 && va <= 300 && vb <= 0 && vb >= -300){
                    if(a >= 0 && a <= 10000 && b >= 0 && b <= 10000){
        
                        t = (a - b) / (vb - va);
                        sa = a + va * t;
                        sb = b + vb * t;

                        int tempo = (int) t * 3600;
                        
                        if (tempo != 0){
                            int segundos = tempo;
                            int horas = 17 + (segundos / 3600);
                            int minutos = (segundos % 3600) / 60;
                            int segundosRestantes = segundos % 60;

                            String horarioFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);

                            System.out.println("\n-=-=-=-= DADOS DA COLISÃO -=-=-=-=");
                            System.out.println("Local: KM " + sb);
                            System.out.println("Após " + tempo + " segundos da partida");
                            System.out.println("Horário: " + horarioFormatado);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");                        }
                        else {
                            System.out.println("\n-=-=-=-= NÃO HAVERÁ COLISÃO :) -=-=-=-=\n");
                        }
                        
                    }
                    else{
                        System.out.println("\nPosicao invalida! \nIntervalo aceito - KM 0 a KM 10000 \nDigite: ");
        
                        System.out.print("\nPosicao do trem A: ");
                        a = tec.nextInt();
        
                        System.out.print("Posicao do trem B: ");
                        b = tec.nextInt();
                    }
                }
                else{
                    System.out.println("\nVelocidade invalida! \nIntervalo aceito - 1Km/h a 300Km/h \nDigite: ");
        
                    System.out.print("\nVelocidade do trem A: ");
                    va = tec.nextInt();
        
                    System.out.print("Velocidade do trem B: ");
                    vb = tec.nextInt();
                }
            }
            catch(InputMismatchException e){
                System.out.println("Entrada inválida! Digite novamente.");

                System.out.print("\nPosicao do trem A: ");
                a = tec.nextInt();
        
                System.out.print("Velocidade do trem A: ");
                va = tec.nextInt();
        
                System.out.print("\nPosicao do trem B: ");
                b = tec.nextInt();
        
                System.out.print("Velocidade do trem B: ");
                vb = tec.nextInt();
            }
        }
    }
}
