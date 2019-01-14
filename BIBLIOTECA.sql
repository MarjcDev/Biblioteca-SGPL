Create database BIBLIOTECA;
USE BIBLIOTECA;

Create table ALUMNOS (Matricula INT  AUTO_INCREMENT PRIMARY KEY, Nombre VARCHAR(35), Apellidos VARCHAR(50),
	Direccion VARCHAR(45),Telefono VARCHAR(12),Mail VARCHAR(45),Status VARCHAR(20) ) ENGINE=InnoDB;

Create table INVENTARIO (IDLibro VARCHAR(10) PRIMARY KEY, Titulo VARCHAR(30),Editorial VARCHAR(30), AUTOR VARCHAR(30),
Genero VARCHAR(30), Descripcion VARCHAR(120), Npag INT, PRECIO INT)ENGINE=InnoDB;

Create table RANGO (IDRango INT PRIMARY KEY, Descripcion VARCHAR(30))ENGINE=InnoDB;

Create table ENCARGADOS(Usuario VARCHAR(20) PRIMARY KEY, Nombre VARCHAR(35),Apellidos VARCHAR(50), Direccion  VARCHAR(50),
MAIL VARCHAR(40), pass VARCHAR(30), IDRango INT, FOREIGN KEY(IDRango) REFERENCES RANGO(IDRango))ENGINE=InnoDB;

Create table PRESTAMOS (IDPedido INT , FechaInicio varchar(11), FechaFinal varchar(11), Matricula INT,INDEX(Matricula), Status varchar(10), FOREIGN KEY(Matricula)REFERENCES ALUMNOS(Matricula),
 Usuario VARCHAR(20), FOREIGN KEY(Usuario) REFERENCES ENCARGADOS(Usuario) )ENGINE=InnoDB;


Create table PIEZAS (IDPedido INT, IDLibro VARCHAR(10), Matricula INT)ENGINE=InnoDB;	


Create table SANCIONES (IDSancion INT PRIMARY KEY, Descripcion VARCHAR (40), Dias INT)ENGINE=InnoDB;

Create table REPORTES (IDReporte INT PRIMARY KEY, Matricula INT, FOREIGN KEY (Matricula)REFERENCES ALUMNOS(Matricula), IDSancion INT, FOREIGN KEY(IDSancion) REFERENCES SANCIONES(IDSancion))ENGINE=InnoDB;




*********************************************************************************
INSERT INTO `encargados` (`Usuario`, `Nombre`, `Apellidos`, `Direccion`, `MAIL`, `pass`, `IDRango`) VALUES ('Mar', 'Marlen', 'Jara Cruz', 'Acuales', 'marjaracruz@gmail.com', '123', '1'), ('Leyva', 'Angel', 'Leyva Garciia', 'Zarzaparrillas', 'drako@hotmail.com', '123', '2');


INSERT INTO INVENTARIO values('MJC0001','Agua y Sangre','ProductionsA','A.A','Religion','Notas Musicalas de la banda Agu...',187,3);

INSERT INTO INVENTARIO values('MJC0002','El Niño de la noche','Planeta','Nancy Kilplark','Misterio','Narra la historia de Katherin un pequ...',322,2);

INSERT INTO INVENTARIO values('MJC0003','Giovani Pappini','XField','Pappini','Biografia','Es la Historia del famosoo Pappini....',117,4);

INSERT INTO INVENTARIO values('MJC0004','Metamorfosis','Porrua','Ovilio','Filosofia','Creer o no creer he ahi la verd....',216,8);

INSERT INTO INVENTARIO values('MJC0005','El Cyrano de Bergerac','Porrua','Frances','Novela','Bergerac tiene una enorme nariz la cua....',159,5);

INSERT INTO INVENTARIO values('MJC0006','Antologia Poetica JLGB','SEP','Borgues','Poesia','Lineas dibujadas de un sentimiento de aquel homb....',97,9);

INSERT INTO INVENTARIO values('MJC0007','Inteligencia Artificial','Oceanica','Jorge Salazar','Ciencia','Toda persona ha evolucionado al pas....',387,3);

INSERT INTO INVENTARIO values('MJC0008','EL futuru de nuetra mente','Planeta A','Micho Kaku','Ciencia','Puedes imaginar pastillas que sean capa....',301,6);


INSERT INTO ALUMNOS values (1313171300,'Felix','Delgado','San Felipe','1234781','FelizDelgado@hotmail.com','Nuevo');

INSERT INTO ALUMNOS values (1313171301,'Jesus','Salazar','Texcoco','23714781','Chuyo@gmail.com','Nuevo');

INSERT INTO ALUMNOS values (1313171302,'Sandra','Martinez','Real de Tultepec','45812394','SanSan@yahoo.com','Nuevo');

INSERT INTO ALUMNOS values (1313171303,'Gabriela','Muñoz','Portales','55328754','Kath@hotmail.com','Nuevo');

INSERT INTO ALUMNOS values (1313171304,'Jaquelin','Vargas','CTM','28765548','JK@yahoo.com','Nuevo');

INSERT INTO ALUMNOS values (1313171305,'Victor','Morales','Prados Sur','554389120','Vico@outlook.com','Nuevo');

INSERT INTO ALUMNOS values (1313171306,'Emma','Hernandez','Portales','5561783429','Emmaa@gmail.com','Nuevo');


*********************************************************************************



//*iNSERTAR EN DOS TABLAS DIFERENTES PIEZAS Y PEDIDOS , REFERENCIA IDPEDIDO EN TABLA PIEZAS (IDPEDIDO)

POR EJEMPLO

[PRESTAMOS
1- 5678
2- 01/12/2017
3- 05/12/2017
4.- 13131171322
5- Mar
6- [1-5678
	2.-1
	3- El señor de los anillos
	]
7- []
]

this.jLabel6.setVisible(true);

        this.txt_lib.setVisible(false);
        this.txt_titu.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel6.setVisible(false)
		this.num.setVisible(false);
		this.adbok.setVisible(false);


        this.Consulta1.setVisible(true);
        
        this.jLabel15.setVisible(true);
        this.jLabel16.setVisible(true);
        this.txt_lib2.setVisible(true);
        this.txt_titu2.setVisible(true);
        this.Consulta2.setVisible(true);
        
         this.jLabel9.setVisible(true);
        this.jLabel10.setVisible(true);
        this.txt_lib1.setVisible(true);
        this.txt_titu1.setVisible(true);
        this.Consulta3.setVisible(true);