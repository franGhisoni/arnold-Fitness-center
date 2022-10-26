

create table test(
					id					int IDENTITY(1,1),
					nombre				int,
					apellido			varchar(100),
		constraint	pk_test	primary key(id)
)
GO

create table fktest(
					id				int IDENTITY(1,1),
					trabajo			varchar(5),
					idtest			int,
		constraint	pk_fktest		primary key(id),
		constraint	fk_fktest_test	foreign key(idtest) references test(id)
)
GO

create table socio(
					id				int IDENTITY(1,1),
					nombre			varchar(50),
					apellido		varchar(50),
					edad			int,
					altura			int,
					sexo			int,
					objetivo		int,
		constraint	pk_socio		primary key(id)
			)
			GO

create table trofeo(
					id				int IDENTITY(1,1),
					tipo			int,
		constraint	pk_trofeo		primary key(id),
		)
		GO

create table trofeo_Socio(
							id						int IDENTITY(1,1),
							idTrofeo				int,
							idSocio					int,
				constraint	pk_trofeo_Socio			primary key(id),
				constraint	fk_trofeo_Socio_trofeo	foreign key(idTrofeo) references trofeo(id),
				constraint	fk_trofeo_Socio_Socio	foreign key(idSocio) references  socio(id)
				)
				GO


create table rutina(
							id				int IDENTITY(1,1),
							duracion		int,
							idSocio			int,
				constraint	pk_rutina		primary key(id),
				--pondria aca idSocio, pero en el uml objetivoAsignado tiene todos los datos por lo que creo que mejor va ahi
				
				)
				GO

create table entrenamiento(
							id						int IDENTITY(1,1),
							--le pongo objetivo pero no entiendo el objetivo jaja
							objetivo				int,
							idRutina				int,
				constraint	pk_entrenamiento		primary key(id),
				constraint	fk_entrenamiento_rutina	foreign key(idRutina) references rutina(id)
				)
				GO

create table ejercicio(
							id							int IDENTITY(1,1),
							nombre						nvarchar(25),
							cantidadSeries				int,
							repeticiones				int,
							pesoAsignado				int,
							tiempo						int,
							nivelAerobico				int,
							grupoMusuclar				int, --podria ser una fk pero me parece re al pedo(quizas no lo es jaja)
							exigenciaMusuclar			int,
							idEntrenamiento				int,--lo pase aca por ser n:1
				constraint	pk_ejercicio				primary key(id),
				constraint fk_ejercicio_Entrenamiento	foreign key(idEntrenamiento) references entrenamiento(id)
				)
				GO

create table objetivoAsignado(
							id							int IDENTITY(1,1),
							idRutina					int,
							idSocio						int,
				constraint	pk_objetivoAsignado			primary key(id),
				constraint	fk_objetivoAsignado_Socio	foreign key(idSocio) references socio(id),
				constraint	fk_objetivoAsignado_Rutina	foreign key(idRutina) references rutina(id)
				)
				GO

--faltaria el login pero no se si es nuestro tema
							
