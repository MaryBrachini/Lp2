import TennisGame3.TennisGame;

public class main {

    public static void main(String[] args) {
        public main(String p1N, String p2N) {
            this.getP1 = p1N;
            this.p2N = p2N;
        }
    
        public String getScore() {
            String s;
            if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
                String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
                s = p[p1];
                return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
            } else {
                if (p1 == p2)
                    return "Deuce";
                s = p1 > p2 ? p1N : p2N;
                return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + s : "Win for " + s;
            }
        }
        
        public void wonPoint(String playerName) {
            if (playerName == "player1")
                this.p1 += 1;
            else
                this.p2 += 1;
            
        }
    }

}