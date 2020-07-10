import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) throws IOException {
		
		Graphe g =new Graphe();
		/*
		 
1,11,11,"piste vallons",2
1,12,8,"piste vallons",2
1,46,2,"piste celvan",1
1,0,9,"TSD PROREL",0
1,4,8,"TK BOIS DES COQS 1-2",0
1,3,9,"piste celvan",1
2,3,11,"piste aiguillette",3
2,68,12,"piste eduits",3
3,2,9,"TS AIGUILLETTE",0
3,48,9,"piste celvan",1
		 */
	   Sommet s0=new Sommet("0")  ;g.ajout_sommet(s0);
	   Sommet s1=new Sommet("1")  ;g.ajout_sommet(s1);
	   Sommet s2=new Sommet("2")  ;g.ajout_sommet(s2);
	   Sommet s3=new Sommet("3")  ;g.ajout_sommet(s3);
	   Sommet s4=new Sommet("4")  ;g.ajout_sommet(s4);
	   Sommet s5=new Sommet("5")  ;g.ajout_sommet(s5);
	   Sommet s6=new Sommet("6")  ;g.ajout_sommet(s6);
	   Sommet s7=new Sommet("7")  ;g.ajout_sommet(s7);
	   Sommet s8=new Sommet("8")  ;g.ajout_sommet(s8);
	   Sommet s9=new Sommet("9")  ;g.ajout_sommet(s9);
	   Sommet s10=new Sommet("10");g.ajout_sommet(s10);
	   Sommet s11=new Sommet("11");g.ajout_sommet(s11);
	   Sommet s12=new Sommet("12");g.ajout_sommet(s12);
	   Sommet s13=new Sommet("13");g.ajout_sommet(s13);
	   Sommet s14=new Sommet("14");g.ajout_sommet(s14);
	   Sommet s15=new Sommet("15");g.ajout_sommet(s15);
	   Sommet s16=new Sommet("16");g.ajout_sommet(s16);
	   Sommet s17=new Sommet("17");g.ajout_sommet(s17);
	   Sommet s18=new Sommet("18");g.ajout_sommet(s18);
	   Sommet s19=new Sommet("19");g.ajout_sommet(s19);
	   Sommet s20=new Sommet("20");g.ajout_sommet(s20);
	   Sommet s21=new Sommet("21");g.ajout_sommet(s21);
	   Sommet s22=new Sommet("22");g.ajout_sommet(s22);
	   Sommet s23=new Sommet("23");g.ajout_sommet(s23);
	   Sommet s24=new Sommet("24");g.ajout_sommet(s24);
	   Sommet s25=new Sommet("25");g.ajout_sommet(s25);
	   Sommet s26=new Sommet("26");g.ajout_sommet(s26);
	   Sommet s27=new Sommet("27");g.ajout_sommet(s27);
	   Sommet s28=new Sommet("28");g.ajout_sommet(s28);
	   Sommet s29=new Sommet("29");g.ajout_sommet(s29);
	   Sommet s30=new Sommet("30");g.ajout_sommet(s30);
	   Sommet s31=new Sommet("31");g.ajout_sommet(s31);
	   Sommet s32=new Sommet("32");g.ajout_sommet(s32);
	   Sommet s33=new Sommet("33");g.ajout_sommet(s33);
	   Sommet s34=new Sommet("34");g.ajout_sommet(s34);
	   Sommet s35=new Sommet("35");g.ajout_sommet(s35);
	   Sommet s36=new Sommet("36");g.ajout_sommet(s36);
	   Sommet s37=new Sommet("37");g.ajout_sommet(s37);
	   Sommet s38=new Sommet("38");g.ajout_sommet(s38);
	   Sommet s39=new Sommet("39");g.ajout_sommet(s39);
	   Sommet s40=new Sommet("40");g.ajout_sommet(s40);
	   Sommet s41=new Sommet("41");g.ajout_sommet(s41);
	   Sommet s42=new Sommet("42");g.ajout_sommet(s42);
	   Sommet s43=new Sommet("43");g.ajout_sommet(s43);
	   Sommet s44=new Sommet("44");g.ajout_sommet(s44);
	   Sommet s45=new Sommet("45");g.ajout_sommet(s45);
	   Sommet s46=new Sommet("46");g.ajout_sommet(s46);
	   Sommet s47=new Sommet("47");g.ajout_sommet(s47);
	   Sommet s48=new Sommet("48");g.ajout_sommet(s48);
	   Sommet s49=new Sommet("49");g.ajout_sommet(s49);
	   Sommet s50=new Sommet("50");g.ajout_sommet(s50);
	   Sommet s51=new Sommet("51");g.ajout_sommet(s51);
	   Sommet s52=new Sommet("52");g.ajout_sommet(s52);
	   Sommet s53=new Sommet("53");g.ajout_sommet(s53);
	   Sommet s54=new Sommet("54");g.ajout_sommet(s54);
	   Sommet s55=new Sommet("55");g.ajout_sommet(s55);
	   Sommet s56=new Sommet("56");g.ajout_sommet(s56);
	   Sommet s57=new Sommet("57");g.ajout_sommet(s57);
	   Sommet s58=new Sommet("58");g.ajout_sommet(s58);
	   Sommet s59=new Sommet("59");g.ajout_sommet(s59);
	   Sommet s60=new Sommet("60");g.ajout_sommet(s60);
	   Sommet s61=new Sommet("61");g.ajout_sommet(s61);
	   Sommet s62=new Sommet("62");g.ajout_sommet(s62);
	   Sommet s63=new Sommet("63");g.ajout_sommet(s63);
	   Sommet s64=new Sommet("64");g.ajout_sommet(s64);
	   Sommet s65=new Sommet("65");g.ajout_sommet(s65);
	   Sommet s66=new Sommet("66");g.ajout_sommet(s66);
	   Sommet s67=new Sommet("67");g.ajout_sommet(s67);
	   Sommet s68=new Sommet("68");g.ajout_sommet(s68);
	  
	   
//	   Integer ii=0;
//	   Sommet x= null;
//	   for (ii=10; ii!=69; ii++)
//	   {
//		   x=new Sommet(ii.toString());
//		   g.ajout_sommet(x);
//	   }
	   //0System.out.println(g.getSize());
	    
//	    Chemin AB = new Chemin ("ab",10, 1);	//pour le moment les 2 temp (Pro et Deb) sont egales
//	    Chemin AC = new Chemin ("ac",15, 2);
//	    Chemin BF = new Chemin ("bf",15, 0);
//	    Chemin BD = new Chemin ("bd",12, 4);
//	    Chemin DF = new Chemin ("df",1,  1);
//	    Chemin CE = new Chemin ("ce",10, 3);
//	    Chemin DE = new Chemin ("de",2,  2);
//	    Chemin FE = new Chemin ("fe",5,  1);
//	    Chemin FE = new Chemin ("fe",5,  1);
	    
	     Chemin x1 = new Chemin(2,"piste myrtilles",1);				s0.ajoutVoisin(x1, s44);
		 Chemin x2 = new Chemin(4," piste myrtills",1);				s0.ajoutVoisin(x2, s43);
		 Chemin x3 = new Chemin(8,"piste saludes",2);				s0.ajoutVoisin(x3, s68);
		 Chemin x4 = new Chemin(11,"piste vallons",1);				s1.ajoutVoisin(x4, s11);
		 Chemin x5 = new Chemin(8,"piste vallons",1);				s1.ajoutVoisin(x5, s12);
		 Chemin x6 = new Chemin(2,"piste celvan",0);				s1.ajoutVoisin(x6, s46);
		 Chemin x7 = new Chemin(9,"TSD PROREL",4);					s1.ajoutVoisin(x7, s0);
		 Chemin x8 = new Chemin(8,"TK BOIS DES COQS 1-2",4);		s1.ajoutVoisin(x8, s4);
		 Chemin x9 = new Chemin(9,"piste celvan",0);				s1.ajoutVoisin(x9, s3);
		 Chemin x10 = new Chemin(11,"piste aiguillette",2);			s2.ajoutVoisin(x10, s3);
		 Chemin x11 = new Chemin(12,"piste eduits" ,2);				s2.ajoutVoisin(x11, s68);
		 Chemin x12 = new Chemin(9,"TS AIGUILLETTE" ,4);			s3.ajoutVoisin(x12, s2);
		 Chemin x13 = new Chemin(9,"piste celvan" ,0);				s3.ajoutVoisin(x13, s48);
		 Chemin x14 = new Chemin(7,"piste bois des coqs" ,2);		s4.ajoutVoisin(x14, s5);
		 Chemin x15 = new Chemin(8,"piste petite alpe" ,2);			s4.ajoutVoisin(x15, s67);
		 Chemin x16 = new Chemin(2,"piste vallons",1);				s4.ajoutVoisin(x16, s49);
		 Chemin x17 = new Chemin(2," TK GRAND ALPE" ,4);			s5.ajoutVoisin(x17, s6);
		 Chemin x18 = new Chemin(3,"TK REPLAT" ,4);					s5.ajoutVoisin(x18, s7);
		 Chemin x19 = new Chemin(4,"piste vallons" ,1);				s5.ajoutVoisin(x19, s1);
		 Chemin x20 = new Chemin(2,"piste combes" ,1);				s5.ajoutVoisin(x20, s47);
		 Chemin x21 = new Chemin(5,"piste bois des coqs" ,2);		s5.ajoutVoisin(x21, s1);
		 Chemin x22 = new Chemin(3,"piste grand alpe" ,0);			s6.ajoutVoisin(x22, s5);
		 Chemin x23 = new Chemin(4,"piste grand serre" ,0);			s7.ajoutVoisin(x23, s5);
		 Chemin x24 = new Chemin(5,"piste grand alpe" ,0);			s7.ajoutVoisin(x24, s5);
		 Chemin x25 = new Chemin(2,"piste combes" ,1);				s8.ajoutVoisin(x25, s47);
		 Chemin x26 = new Chemin(2,"piste eftanis" ,1);				s8.ajoutVoisin(x26, s5);
		 Chemin x27 = new Chemin(6,"TSD GRAND SERRE" ,4);			s8.ajoutVoisin(x27, s9);
		 Chemin x28 = new Chemin(4,"piste vallons" ,1);				s9.ajoutVoisin(x28, s49);
		 Chemin x29 = new Chemin(3,"piste eftanis" ,1);				s9.ajoutVoisin(x29, s14);
		 Chemin x30 = new Chemin(12,"piste mur chevalier" ,3);		s9.ajoutVoisin(x30, s50);
		 Chemin x31 = new Chemin(9,"piste draye" ,2);				s9.ajoutVoisin(x31, s13);
		 Chemin x32 = new Chemin(4,"piste foret" ,1);				s10.ajoutVoisin(x32, s51);
		 Chemin x33 = new Chemin(1,"piste combes" ,1);				s10.ajoutVoisin(x33, s50);
		 Chemin x34 = new Chemin(5,"piste génépi" ,1);				s10.ajoutVoisin(x34, s21);
		 Chemin x35 = new Chemin(7,"piste eftanis" ,1);				s10.ajoutVoisin(x35, s8);
		 Chemin x36 = new Chemin(4,"piste briance" ,0);				s11.ajoutVoisin(x36, s37);
		 Chemin x37 = new Chemin(8,"TSD COMBES" ,4);				s11.ajoutVoisin(x37, s10);
		 Chemin x38 = new Chemin(2,"piste chene" ,0);				s12.ajoutVoisin(x38, s62);
		 Chemin x39 = new Chemin(14,"piste luc alphand" ,3);		s12.ajoutVoisin(x39, s38);
		 Chemin x40 = new Chemin(7," TSD OREE DU BOIS" ,4);			s12.ajoutVoisin(x40, s13);
		 Chemin x41 = new Chemin(10,"TPH SERRE CHEVALIER" ,4);		s12.ajoutVoisin(x41, s9);
		 Chemin x42 = new Chemin(12,"piste pylones" ,3);			s13.ajoutVoisin(x42, s12);
		 Chemin x43 = new Chemin(7,"piste draye" ,2);				s13.ajoutVoisin(x43, s66);
		 Chemin x44 = new Chemin(4,"piste 3croix" ,0);				s13.ajoutVoisin(x44, s47);
		 Chemin x45 = new Chemin(2,"piste foret" ,1);				s13.ajoutVoisin(x45, s51);
		 Chemin x46 = new Chemin(3,"piste fangeas" ,1);				s14.ajoutVoisin(x46, s21);
		 Chemin x47 = new Chemin(5,"piste rocher de l'enfer" ,2);	s14.ajoutVoisin(x47, s55);
		 Chemin x48 = new Chemin(2,"piste eftanis" ,1);				s14.ajoutVoisin(x48, s10);
		 Chemin x49 = new Chemin(8,"piste echaillon" ,2);			s14.ajoutVoisin(x49, s17);
		 Chemin x50 = new Chemin(4,"piste lievre blanc" ,0);		s15.ajoutVoisin(x50, s12);
		 Chemin x51 = new Chemin(7,"TSD FORET" ,4);					s15.ajoutVoisin(x51, s14);
		 Chemin x52 = new Chemin(5,"piste marteau" ,1);				s15.ajoutVoisin(x52, s64);
		 Chemin x53 = new Chemin(3,"piste route aravet" ,0);		s15.ajoutVoisin(x53, s62);
		 Chemin x54 = new Chemin(7," TS COTE CHEVALIER" ,4);		s16.ajoutVoisin(x54, s14);
		 Chemin x55 = new Chemin(3,"piste traverse" ,1);			s16.ajoutVoisin(x55, s61);
		 Chemin x56 = new Chemin(2,"piste sellettes" ,1);			s17.ajoutVoisin(x56, s16);
		 Chemin x57 = new Chemin(8,"TSD CLOT GAUTHIER" ,4);			s17.ajoutVoisin(x57, s18);
		 Chemin x58 = new Chemin(4,"piste sellettes" ,1);			s17.ajoutVoisin(x58, s23);
		 Chemin x59 = new Chemin(3,"clot gauthier" ,2);				s18.ajoutVoisin(x59, s56);
		 Chemin x60 = new Chemin(2,"piste goulet " ,1);				s18.ajoutVoisin(x60, s58);
		 Chemin x61 = new Chemin(13,"piste isolee " ,3);			s19.ajoutVoisin(x61, s55);
		 Chemin x62 = new Chemin(11,"piste ailefroide " ,3);		s19.ajoutVoisin(x62, s20);
		 Chemin x63 = new Chemin(12,"piste creux du loup" ,3);		s19.ajoutVoisin(x63, s20);
		 Chemin x64 = new Chemin(4,"piste super draye" ,3);			s20.ajoutVoisin(x64, s57);
		 Chemin x65 = new Chemin(6,"piste clot gauthier" ,2);		s20.ajoutVoisin(x65, s17);
		 Chemin x66 = new Chemin(7,"TK EYCHAUDA" ,4);				s20.ajoutVoisin(x66, s19);
		 Chemin x67 = new Chemin(3,"piste fangeas" ,1);				s21.ajoutVoisin(x67, s22);
		 Chemin x68 = new Chemin(4,"piste alpage" ,1);				s21.ajoutVoisin(x68, s23);
		 Chemin x69 = new Chemin(3,"TK ALPAGE" ,4);					s22.ajoutVoisin(x69, s21);
		 Chemin x70 = new Chemin(2,"piste marteau" ,1);				s22.ajoutVoisin(x70, s52);
		 Chemin x71 = new Chemin(3,"piste sellettes" ,1);			s23.ajoutVoisin(x71, s17);
		 Chemin x72 = new Chemin(4,"piste bois" ,2);				s23.ajoutVoisin(x72, s24);
		 Chemin x73 = new Chemin(15,"piste casse du boeuf" ,3);		s23.ajoutVoisin(x73, s40);
		 Chemin x74 = new Chemin(5,"piste lacets" ,2);				s24.ajoutVoisin(x74, s63);
		 Chemin x75 = new Chemin(6,"TK PRE DU BOIS" ,4);			s24.ajoutVoisin(x75, s23);
		 Chemin x76 = new Chemin(6,"TK CRETES" ,4);					s25.ajoutVoisin(x76, s26);
		 Chemin x77 = new Chemin(1,"piste goulet" ,1);				s25.ajoutVoisin(x77, s61);
		 Chemin x78 = new Chemin(2,"piste cabane" ,1);				s26.ajoutVoisin(x78, s31);
		 Chemin x79 = new Chemin(5,"piste sellettes" ,1);			s26.ajoutVoisin(x79, s17);
		 Chemin x80 = new Chemin(1,"piste goulet" ,1);				s27.ajoutVoisin(x80, s25);
		 Chemin x81 = new Chemin(9,"piste bez" ,2);					s28.ajoutVoisin(x81, s42);
		 Chemin x82 = new Chemin(4,"TS FREJUS" ,4);					s28.ajoutVoisin(x82, s27);
		 Chemin x83 = new Chemin(6,"TK BARRES" ,4);					s29.ajoutVoisin(x83, s30);
		 Chemin x84 = new Chemin(3,"piste goulet" ,1);				s29.ajoutVoisin(x84, s61);
		 Chemin x85 = new Chemin(1,"piste barres" ,0);				s30.ajoutVoisin(x85, s31);
		 Chemin x86 = new Chemin(2,"piste cabane" ,1);				s31.ajoutVoisin(x86, s26);
		 Chemin x87 = new Chemin(4,"piste goulet" ,1);				s31.ajoutVoisin(x87, s27);
		 Chemin x88 = new Chemin(3,"piste barres" ,0);				s31.ajoutVoisin(x88, s29);
		 Chemin x89 = new Chemin(1,"piste barres" ,0);				s31.ajoutVoisin(x89, s30);
		 Chemin x90 = new Chemin(8,"TK CLOT" ,4);					s31.ajoutVoisin(x90, s32);
		 Chemin x91 = new Chemin(3,"TK MEA" ,3);					s31.ajoutVoisin(x91, s33);
		 Chemin x92 = new Chemin(2,"piste chameant" ,0);			s32.ajoutVoisin(x92, s31);
		 Chemin x93 = new Chemin(5,"piste pre jeanne" ,1);			s33.ajoutVoisin(x93, s31);
		 Chemin x94 = new Chemin(2,"piste chameant" ,0);			s33.ajoutVoisin(x94, s32);
		 Chemin x95 = new Chemin(3,"piste bez" ,2);					s34.ajoutVoisin(x95, s63);
		 Chemin x96 = new Chemin(10,"TSD VALLONS" ,4);				s34.ajoutVoisin(x96, s35);
		 Chemin x97 = new Chemin(11,"piste cucumelle" ,2);			s35.ajoutVoisin(x97, s60);
		 Chemin x98 = new Chemin(12,"piste cucumelle" ,2);			s35.ajoutVoisin(x98, s34);
		 Chemin x99 = new Chemin(4,"melezes" ,1);					s36.ajoutVoisin(x99, s12);
		 Chemin x100 = new Chemin(3,"piste celvan" ,0);				s37.ajoutVoisin(x100, s48);
		 Chemin x101 = new Chemin(5,"TK CHAMPCELLA" ,4);			s37.ajoutVoisin(x101, s36);
		 Chemin x102 = new Chemin(7,"TC RATIER" ,4);				s38.ajoutVoisin(x102, s12);
		 Chemin x103 = new Chemin(4,"TSD BLETONET" ,4);				s38.ajoutVoisin(x103, s12);
		 Chemin x104 = new Chemin(7," TC ARAVET" ,4);				s39.ajoutVoisin(x104, s15);
		 Chemin x105 = new Chemin(12," TSD CASSE DU BOEUF" ,4);		s40.ajoutVoisin(x105, s23);
		 Chemin x106 = new Chemin(11," TC FREJUS" ,4);				s41.ajoutVoisin(x106, s25);
		 Chemin x107 = new Chemin(9," DMC PONTILLAS" ,4);			s42.ajoutVoisin(x107, s28);
		 Chemin x108 = new Chemin(2," piste myrtilles",1);			s43.ajoutVoisin(x108, s67);
		 Chemin x109 = new Chemin(3," piste myrtilles",1);			s44.ajoutVoisin(x109, s43);
		 Chemin x110 = new Chemin(9," piste cabane du berger",3);	s44.ajoutVoisin(x110, s43);
		 Chemin x111 = new Chemin(6," piste eduits",2);				s45.ajoutVoisin(x111, s3);
		 Chemin x112 = new Chemin(7," piste celvan",0);				s46.ajoutVoisin(x112, s3);
		 Chemin x113 = new Chemin(3," piste eduits",2);				s46.ajoutVoisin(x113, s45);
		 Chemin x114 = new Chemin(1," piste 3croix",0);				s47.ajoutVoisin(x112, s66);
		 Chemin x115 = new Chemin(2,"piste eftanis" ,1);			s47.ajoutVoisin(x115, s5);
		 Chemin x116 = new Chemin(3,"piste briance" ,0);			s48.ajoutVoisin(x116, s38);
		 Chemin x117 = new Chemin(5,"piste vallons" ,1);			s49.ajoutVoisin(x117, s5);
		 Chemin x118 = new Chemin(3,"piste combes" ,1);				s50.ajoutVoisin(x118, s8);
		 Chemin x119 = new Chemin(3,"piste foret" ,1);				s51.ajoutVoisin(x119, s22);
		 Chemin x120 = new Chemin(2,"piste marteau" ,1);			s52.ajoutVoisin(x120, s53);
		 Chemin x121 = new Chemin(3,"piste marteau" ,1);			s52.ajoutVoisin(x121, s54);
		 Chemin x122 = new Chemin(4,"piste stade" ,2);				s52.ajoutVoisin(x122, s54);
		 Chemin x123 = new Chemin(3,"piste melezes " ,1);			s53.ajoutVoisin(x123, s36);
		 Chemin x124 = new Chemin(3,"piste marteau" ,1);			s54.ajoutVoisin(x124, s15);
		 Chemin x125 = new Chemin(6,"piste rocher de l'enfer" ,2);	s55.ajoutVoisin(x125, s17);
		 Chemin x126 = new Chemin(9,"piste super draye" ,3);		s56.ajoutVoisin(x126, s57);
		 Chemin x127 = new Chemin(3,"piste clot gauthier" ,2);		s56.ajoutVoisin(x127, s20);
		 Chemin x128 = new Chemin(5,"piste clot gauthier" ,2);		s57.ajoutVoisin(x128, s17);
		 Chemin x129 = new Chemin(3,"piste clot goulet" ,1);		s58.ajoutVoisin(x129, s31);
		 Chemin x130 = new Chemin(3,"piste clot sellettes" ,1);		s58.ajoutVoisin(x130, s26);
		 Chemin x131 = new Chemin(3,"piste prairies" ,2);			s59.ajoutVoisin(x131, s28);
		 Chemin x132 = new Chemin(8,"piste route frejus" ,0);		s59.ajoutVoisin(x132, s60);
		 Chemin x133 = new Chemin(1,"piste route frejus" ,0);		s60.ajoutVoisin(x133, s59);
		 Chemin x134 = new Chemin(2,"piste clot goulet" ,1);		s60.ajoutVoisin(x134, s34);
		 Chemin x135 = new Chemin(3,"piste bois" ,2);				s61.ajoutVoisin(x135, s24);
		 Chemin x136 = new Chemin(3,"piste clot goulet" ,1);		s61.ajoutVoisin(x136, s60);
		 Chemin x137 = new Chemin(6,"piste route aravet" ,0);		s62.ajoutVoisin(x137, s39);
		 Chemin x138 = new Chemin(3,"piste bez" ,2);				s63.ajoutVoisin(x138, s28);
		 Chemin x139 = new Chemin(4,"piste marteau" ,1);			s64.ajoutVoisin(x139, s39);
		 Chemin x140 = new Chemin(9,"casse du beouf" ,3);			s64.ajoutVoisin(x140, s40);
		 Chemin x141 = new Chemin(7,"piste stade" ,2);				s65.ajoutVoisin(x141, s13);
		 Chemin x142 = new Chemin(6,"piste draye" ,2);				s65.ajoutVoisin(x142, s13);
		 Chemin x143 = new Chemin(3,"piste draye" ,2);				s66.ajoutVoisin(x143, s65);
		 Chemin x144 = new Chemin(4,"piste petit alpe" ,2);			s67.ajoutVoisin(x144, s1);
		 Chemin x145 = new Chemin(4,"piste myrtilles" ,1);			s68.ajoutVoisin(x145, s1);
		 Chemin x146 = new Chemin(6,"piste eduits" ,2);				s68.ajoutVoisin(x146, s45);
		
//	    a.ajoutVoisin(AB, b);
//	    a.ajoutVoisin(AC, c);
//	    b.ajoutVoisin(BF, f);
//	    b.ajoutVoisin(BD, d);
//	    c.ajoutVoisin(CE, e);
//	    d.ajoutVoisin(DF, f);
//	    d.ajoutVoisin(DE, e);
//	    f.ajoutVoisin(FE, e);
	    
		 Scanner a=new Scanner(System.in);
		 System.out.println("Quel type de skieur etes vous? (1: debutant , 2: professéionel)");
		 int typeSkieur=a.nextInt();
		 a.nextLine();
		 
		 System.out.println("Ou vous trouvez vous? :");
		 String depart=a.nextLine();
		 
		 System.out.println("A quel endroit souhaitez-vous vous rendre?");
		 String destination=a.nextLine();
		 
		 
		 //System.out.println(g.returnSommet(destination).getDistanceParSource());
		 
		 System.out.println("->" + depart + "<-");
		 System.out.println("->" + destination + "<-");
		 
		 g = Graphe.Dikjstra(g, g.returnSommet(depart), typeSkieur);
		 
		 System.out.println(g.returnSommet(destination).getDistanceParSource());
		 
		 //System.out.println("drtdrt "+s56.getDistanceParSource());
		 //System.out.println(g.returnSommet("34").getNom());

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
/*

	    String Filename = "D:/r.txt";
	    
	    File file = new File(Filename);
	    
	    
	    Scanner in = new Scanner(file);
	    
	    String[] parts;
	    int tempDeb=0;
	    int typePiste=0;
	    int tempPro=0;
	    int i =0;
	       //Sommet[]som=new Sommet[70];
	    int yes=0;
	    
	    while(in.hasNextLine()) {
	    	  ++i;
	    	  String line=in.nextLine();
	    	  parts=line.split(";");
	    	  
	    	  tempDeb=Integer.valueOf(parts[2]);
	    	  typePiste=Integer.valueOf(parts[4]);
	    	  
	    	  tempPro = calculTempPro(tempDeb, typePiste);
	    	  
	    	  Chemin newChemin ; newChemin = new Chemin(parts[3], tempDeb, tempPro);

	    	  
	    	  //Sommet newSommet1 ; newSommet1 = new Sommet (parts[1]);
	    	  //Sommet newSommet0 ; newSommet0= new Sommet(parts[0], newSommet1, newChemin);
	    	  
	    	  for (Sommet n : g.getNodes())
	    		  if (n.getNom().equals(parts[1])){
	    			  yes =1;
	    			  //System.out.println("Sommet is in the graph : " + parts[1]);
	    		  }
	    	  
	    	  if  (yes!=1){
	    		  Sommet newSommet10 ; newSommet10 = new Sommet (parts[1]);
	    		  g.ajout_sommet(newSommet10);
	    		  //System.out.println("adding : " + newSommet10.getNom());
	    	  }
	    	  yes=0;
	    	  
	    	  for (Sommet n : g.getNodes())
	    		  if (n.getNom().equals(parts[0])){
	    			  n.ajoutVoisin(newChemin, g.returnSommet(parts[1]));
	    			  //System.out.println("updating : "+ parts[0]);
	    			  yes=1;
	    			  break;
	    		  }
	    	  if (yes !=1){
	    		  Sommet newSommet00 ; newSommet00= new Sommet(parts[0], g.returnSommet(parts[1]), newChemin);
	    		  g.ajout_sommet(newSommet00);
	    		  System.out.println("adding : "+ newSommet00.getNom());
	    	  }
	    	  	    	  
//	    	  System.out.print	(parts[0]+"\t");
//	    	  System.out.print	(parts[1]+"\t");
//	    	  System.out.print	(parts[2]+"\t");
//	    	  System.out.print	(parts[3]+"\t");
//	    	  System.out.println(parts[4]);
//	    	  
	    	  yes=0;
	    	  
	    }
	    //g.deleteSommet(g.returnSommet("100"));
	    
	   
	    
	    for (Sommet j : g.getNodes())
	    {
	    	//if (j.getNom().equals("100"))
	    		//g.deleteSommet(j);
	    	//System.out.println(j.getNom());
	    	j.afficherSommetsVoisins();
	    }

	//    System.out.println("nb de sommet dans le graphe: " + g.getSize());
	    //g.afficheGraph();
	    //g = g.Dikjstra(g, g.returnSommet("1"));
	    
	    //g.returnSommet("3").afficherCheminsSortants();
*/
		/*
		String Filename = "D:/r.txt";
		String Filename2 = "D:/e.txt";
	    
	    File file = new File(Filename);
	    File file2 = new File(Filename2);
	    
	    String charset = "UTF-8";
	    String delete = ";";
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
	    PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file2), charset));
		
	    for (String line; (line = reader.readLine()) != null;) {
	        line = line.replace(delete, ",");
	        line = line.replace("\n", "(");
	        writer.println(line);
	    }
	    
	    reader.close();
	    writer.close();
	    */
		
	}

	
}
