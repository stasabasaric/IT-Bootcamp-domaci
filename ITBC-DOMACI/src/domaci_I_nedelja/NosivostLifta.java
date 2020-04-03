package domaci_I_nedelja;

import java.util.Scanner;

public class NosivostLifta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * Zadatak 1: U zgradi se nalazi lift nosivosti 680kg. Napisati program koji
		 * proverava da li ce lift bezbedno krenuti u zavisnostii od tezine koju treba
		 * da ponese. Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift
		 * je pokrenut
		 */

		// Resenje zadatka delim na dva slucaja, prvi je uproscen (banalizovan) dok je
		// drugi slucaj kompleksniji
		// Prilikom izvrsenja zadatka, moze da se odabere koji slucaj zelite da se
		// izvrsi i to unosom odgovarajuceg broja, 1 ili 2

		float vaga; // Fiktivna vaga
		int nosivost;
		int slucaj;

		vaga = 0;
		nosivost = 680;

		System.out.println(
				"Unesite slucaj koji zelite da se izvrsi, za prvi slucaj se unosi broj 1, a za drugi slucaj broj 2");
		slucaj = sc.nextInt();

		System.out.println();

		while (slucaj != 1 && slucaj != 2) {
			System.out.println("Niste uneli odgovarajuci broj za izvrsenje zeljenog slucaja, unesite opet");
			slucaj = sc.nextInt();

			System.out.println();
		}

		switch (slucaj) {

		case 1:

			// SLUCAJ 1
			// U prvom slucaju ne znamo u kom smeru se lift krece i ne prate se pozicije tj
			// spratovi lifta
			// Pretopstavlja se na lift ima ugradjenu vagu koja meri masu/tezinu u liftu
			// Vaga za lift izbacuje informaciju da li lift moze da se pokrene ili ne
			// Lift kada je u granicama opterecenosti, moze da se pokrene

			System.out.println("Proverava se opterecenost lifta, unesite zabelezenu tezinu");

			vaga = sc.nextFloat();

			while (vaga < 0) {
				System.out.println("Tezina ne moze biti negativna, unesite odg tezinu");
				vaga = sc.nextFloat();

			}

			if (vaga > nosivost) {
				System.out.println("Ukupna tezina na spratu je: " + vaga);
				System.out.println("Lift nije pokrenut jer je preopterecena nosivost");
			}

			else {
				if (vaga < nosivost) {
					System.out.println("Ukupna tezina na spratu je: " + vaga);
					System.out.println("Lift je pokrenut");

				} else {
					System.out.println("Ukupna tezina na spratu je: " + vaga);
					System.out.println("Opasnost! Lift je u granicama opterecenosti, ali je pokrenut");

				}
			}

			break;

		case 2:

			// SLUCAJ 2

			// Unosimo startnu poziciju lifta i zavrsnu poziciju lifta, odrediste/sprat na
			// koji zelimo da lift stigne
			// Startna i zavrsna pozicija predstavljaju jedan ciklus kretanja lifta

			// Uvodim sledecu pretpostavke:

			// Lift kada je u granicama opeterecenosti, pokrece se

			// Objekat sa liftom ima 5 spratova, gde je 0-ti sprat prizemlje
			// Lift moze da stane na svakom narednom spratu i cekira se tezina prilikom
			// daljeg pokretanja na naredni sprat
			// Uzimamo u obzir da je ovo tip lifta koji se uglavnom javlja u trznim
			// centrima.. Tj uglavnom staju na svakom spratu.
			// Kad bi bio u pitanju lift u stambenoj zgradi, uglavnom se ne desava da lift
			// staje na narednom spratu ukoliko lift ide "ka gore",
			// vec staje na narednom spratu kada lift ide "na dole" jer je veca verovatnoca
			// da neko isto zeli da stigne do prizemlja..

			// Ukoliko je zavrsna pozicija lifta neka od visih spratova, odnosno veca od
			// startne pozicije, ne moze da ide ka dole vazi isto i obratno
			//
			// Pretpostavlja lift ima vagu koja meri tezinu - ljudi, zivotinje, predmeti..

			int start, fin, brojac; // Startna pozicija, zavrsna pozicija lifta, brojac

			int stani;

			System.out.println("Unesite startnu poziciju lifta");
			start = sc.nextInt();

			while (start < 0 || start > 5) {

				System.out.println(
						"Lift ima spratove od 0 do 5, niste uneli odgovarajucu startnu poziciju, unesite opet");
				start = sc.nextInt();
			}

			System.out.println();

			System.out.println("Unesite zavrsnu poziciju lifta, odnosno sprat na koji treba da se ide");
			fin = sc.nextInt();

			while (fin < 0 || fin > 5) {

				System.out.println(
						"Lift ima spratove od 0 do 5, niste uneli odgovarajucu zavrsnu poziciju, unesite opet");
				fin = sc.nextInt();
			}

			System.out.println();

			if (start == fin) {
				System.out.println("Lift je vec na tom spratu, unesite sprat na koji hocete da idete");
				return;
			}

			brojac = start;

			if (start > fin) {

				while (brojac > fin) {

					if (brojac == start) {

						System.out.println("Sprat " + brojac + ": Vaga izracunava tezinu, unesite izracunato");

						vaga = sc.nextFloat();

						while (vaga < 0) {
							System.out.println("Tezina ne moze biti u minusu, unesite opet");

							vaga = sc.nextFloat();
						}

						if (vaga > nosivost) {
							System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
							System.out.println("Lift nije pokrenut jer je preopterecena nosivost");
							return;
						}

						else {
							if (vaga < nosivost) {
								System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
								System.out.println("Lift je pokrenut");
								System.out.println();
								brojac = brojac - 1;
							} else {
								System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
								System.out.println("Opasnost! Lift je u granicama opterecenosti, ali je pokrenut");
								System.out.println();
								brojac = brojac - 1;
							}

						}
						if (brojac == fin) {
							System.out.println("Lift je stigao na krajnje odrediste, sprat " + brojac);
							System.out.println();
						}
					}

					else {

						if (brojac < start) {

							System.out.println("Da li lift treba da stane na spratu " + brojac
									+ " ? Ako treba, ukucati 1, ako ne ukucati 2");

							stani = sc.nextInt();

							while (stani != 1 && stani != 2) {

								System.out.println("Nije unesen trazen podatak, da li lift staje na spratu " + brojac
										+ " Unesite 1 ako da, 2 ako ne staje");

								stani = sc.nextInt();

							}

							switch (stani) {

							case 1:
								System.out.println("Sprat " + brojac + ": Vaga izracunava tezinu, unesite izracunato");

								vaga = sc.nextFloat();

								while (vaga < 0) {
									System.out.println("Tezina ne moze biti u minusu, unesite opet");

									vaga = sc.nextFloat();
								}

								if (vaga > nosivost) {

									System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
									System.out.println("Lift nije pokrenut jer je preopterecena nosivost");
									return;
								}

								else {
									if (vaga < nosivost) {
										System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
										System.out.println("Lift je pokrenut");
										System.out.println();
										brojac = brojac - 1;
									} else {
										System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
										System.out.println(
												"Opasnost! Lift je u granicama opterecenosti, ali je pokrenut");
										brojac = brojac - 1;
									}

								}

								break;

							case 2:

								System.out.println("Lift ide na naredni sprat");
								System.out.println();

								brojac = brojac - 1;

								break;

							}

							if (brojac == fin) {

								System.out.println("Lift je stigao na krajnje odrediste, sprat " + brojac);
								System.out.println();
							}

						}

					}
				}

			}

			else {

				if (start < fin) {

					while (brojac < fin) {

						if (brojac == start) {

							System.out.println("Sprat " + brojac + ": Vaga izracunava tezinu, unesite izracunato");

							vaga = sc.nextFloat();

							while (vaga < 0) {
								System.out.println("Tezina ne moze biti u minusu, unesite opet");

								vaga = sc.nextFloat();
							}

							if (vaga > nosivost) {
								System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
								System.out.println("Lift nije pokrenut jer je preopterecena nosivost");
								return;
							}

							else {
								if (vaga < nosivost) {
									System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
									System.out.println("Lift je pokrenut");
									System.out.println();
									brojac = brojac + 1;
								} else {
									System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
									System.out.println("Opasnost! Lift je u granicama opterecenosti, ali je pokrenut");
									System.out.println();
									brojac = brojac + 1;
								}

							}

							if (brojac == fin) {

								System.out.println("Lift je stigao na krajnje odrediste, sprat " + brojac);
								System.out.println();
							}
						}

						else {

							if (brojac > start) {

								System.out.println("Da li lift treba da stane na spratu " + brojac
										+ " ? Ako treba, ukucati 1, ako ne ukucati 2");

								stani = sc.nextInt();

								while (stani != 1 && stani != 2) {

									System.out.println("Nije unesen trazen podatak, da li lift staje na spratu "
											+ brojac + " Unesite 1 ako da, 2 ako ne staje");

									stani = sc.nextInt();

								}

								switch (stani) {

								case 1:
									System.out.println(
											"Sprat " + brojac + ": Vaga izracunava tezinu, unesite izracunato");

									vaga = sc.nextFloat();

									while (vaga < 0) {
										System.out.println("Tezina ne moze biti u minusu, unesite opet");

										vaga = sc.nextFloat();
									}

									if (vaga > nosivost) {

										System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
										System.out.println("Lift nije pokrenut jer je preopterecena nosivost");
										return;
									}

									else {
										if (vaga < nosivost) {
											System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
											System.out.println("Lift je pokrenut");
											System.out.println();
											brojac = brojac + 1;
										} else {
											System.out.println("Ukupna tezina na spratu " + brojac + " je: " + vaga);
											System.out.println(
													"Opasnost! Lift je u granicama opterecenosti, ali je pokrenut");
											brojac = brojac + 1;
										}

									}

									break;

								case 2:

									System.out.println("Lift ide na naredni sprat");
									System.out.println();

									brojac = brojac + 1;

									break;

								}

								if (brojac == fin) {

									System.out.println("Lift je stigao na krajnje odrediste, sprat " + brojac);
									System.out.println();
								}

							}

						}
					}

				}

			}
			break;
		}

	}

}
