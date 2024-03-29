package game.interaction;

public class Magician {		
		private int hp;
		private int mp;
		private int mAtk;
		private int def;
		private int exp;
		
		public Magician() {
			
			this.hp = 15;
			this.mp = 30;
			this.mAtk = 10;
			this.def = 5;
			this.exp = 0;
			
		}
		
		// 교전을 할 경우 상호간에 수치값이 교환되어야 합니다.
		// Warrior쪽에서 Orc쪽의 수치를 깎아주고
		// Orc쪽에서 Warrior쪽의 수치를 깎아야합니다.
		public void huntOrc(Orc orc) {
			// 전사가 오크를 때리기 위해서 먼저 orc의 doBattle을 호출합니다.
			orc.doBattle(this.mAtk);
			
			// 마법사도 오크에게 공격을 받습니다.
			this.hp = (this.hp + this.def) - orc.getAtk();
			System.out.println("교전 결과 마법사의 체력 : " + this.hp);
		}
		
		
		public void huntMonster(Monster monster) {
			
			monster.doBattle(this.mAtk);
			
			if(monster.getHp() > 0) { // 몬스터 체력이 0보다 큰지 검사(0보다 크다면)
				
				this.hp = (this.hp + this.def) - monster.getAtk();// 정상 교전 진행
				
			}
			
			else {
				
				System.out.println("몬스터가 이미 죽어서 교전이 끝났습니다."); // 몬스터가 죽었음을 알림
				
				
			}
			
			System.out.println("교전 결과 마법사의 체력 : " + this.hp); //교전 결과 브리핑
						
		}
		
		public void huntTroll(Troll troll) {
			
			troll.doBattle(this.mAtk);
			
			if(troll.getHp() > 0) { // 트롤 체력이 0보다 큰지 검사(0보다 크다면)
				
				this.hp = (this.hp + this.def) - troll.getAtk();// 정상 교전 진행
				
			}
			
			else {
				
				System.out.println("트롤이 이미 죽어서 교전이 끝났습니다."); // 트롤이 죽었음을 알림
				
				
			}
			
			System.out.println("교전 결과 마법사의 체력 : " + this.hp); //교전 결과 브리핑
						
		}	

		//getter, setter를 Warrior, orc에 만들어주세요
		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public int getMp() {
			return mp;
		}

		public void setMp(int mp) {
			this.mp = mp;
		}

		public int getMatk() {
			return mAtk;
		}

		public void setMatk(int mAtk) {
			this.mAtk = mAtk;
		}

		public int getDef() {
			return def;
		}

		public void setDef(int def) {
			this.def = def;
		}

		public int getExp() {
			return exp;
		}

		public void setExp(int exp) {
			this.exp = exp;
		}
		
		
		
		
		

	}



