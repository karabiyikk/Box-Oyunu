public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int chance;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.healt > 0 && this.f2.healt > 0) {
                System.out.println("***** YENİ ROUND *****");
                if (isChance()) {
                    this.f2.healt = this.f1.Hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                } else {
                    this.f1.healt = this.f2.Hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.healt);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.healt);
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }


    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.healt == 0) {
            System.out.println(this.f2.name + " Kazandı");
            return true;
        }
        if (this.f2.healt == 0) {
            System.out.println(this.f1.name + " Kazandı");
            return true;
        }
        return false;
    }

    boolean isChance() {
        double chanceNumber = Math.random() * 100;
        return chanceNumber <= 50;
    }
}
