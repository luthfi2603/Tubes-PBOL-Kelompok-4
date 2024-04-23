-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2024 at 10:02 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes_pbol`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `kode_dosen` char(3) NOT NULL,
  `nama_dosen` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`kode_dosen`, `nama_dosen`) VALUES
('ADE', 'Ade Sarah Huzaifah, S.Kom., M.Kom.'),
('AGH', 'Aghni Syahmarani, S.Si., M.Si.'),
('AIN', 'Ainul Hizriadi, S.Kom., M.Sc.'),
('ANN', 'Annisa Fadhillah Pulungan, S.Kom., M.Kom.'),
('BAI', 'Baihaqi Siregar, S.Si., M.T.'),
('DDA', 'Dedy Arisandi, S.T., M.Kom.'),
('ERN', 'Dr. Erna Budhiarti Nababan, M.IT.'),
('FNN', 'Fanindia Purnamasari, S.TI, M.IT.'),
('INA', 'Indra Aulia, S.TI, M.Kom.'),
('IVJ', 'Ivan Jaya, S.Si., M.Kom.'),
('MAB', 'Dr. Mohammad Andri Budiman S.T., M.Comp.Sc., M.E.M.'),
('MAM', 'Dr. Muhammad Anggia Munchtar, ST., MMIT.'),
('MFS', 'Mohammad Fadly Syahpurta, B.Sc., M.Sc.IT.'),
('MLY', 'Maulida Yanti, S.Si., M.Si'),
('MYD', 'Prof. Drs. Mahyuddin K. M. Nasution, M.IT., Ph.D.'),
('NSK', 'Niskarto Zendrato, S.Kom., M.Kom.'),
('OPM', 'Prof. Dr. Drs. Opim Salim Sitompul, M.Sc.'),
('ROM', 'Romi Fadillah Rahmat, B.IT., M.Sc.IT.'),
('ROZ', 'Fahrurozi Lubis, B.IT., M.Sc.IT.'),
('RSS', 'Rossy Nurhasanah, S.Kom., M.Kom'),
('SEF', 'Dr. Syahril Efendi, S.Si., M.IT.'),
('SFR', 'Muhammad Safri Lubis, ST., M.Com.'),
('SNM', 'Seniman, S.Kom., M.Kom.'),
('SRH', 'Sarah Purnamawat, S.T., M.Sc.'),
('SWL', 'Dr. Sawaluddin, M.IT.'),
('ULF', 'Ulfi Andayani, S.Kom., M.Kom.'),
('UMY', 'Umaya Ramadhani Putri Nasution, S.Ti., M.Kom.'),
('VEN', 'Dr. Marischa Elveny, S.Ti., M.Kom.');

-- --------------------------------------------------------

--
-- Stand-in structure for view `gabungan`
-- (See below for the actual view)
--
CREATE TABLE `gabungan` (
`id_kelas` int(10) unsigned
,`kode_matkul` char(7)
,`kode_dosen` char(3)
,`kode_ruangan` char(5)
,`jam` char(11)
,`hari` enum('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu')
,`semester` char(1)
,`kom` char(1)
,`nama_matkul` varchar(255)
,`sks` char(1)
,`nama_dosen` varchar(255)
);

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id_kelas` int(10) UNSIGNED NOT NULL,
  `kode_matkul` char(7) NOT NULL,
  `kode_dosen` char(3) NOT NULL,
  `kode_ruangan` char(5) NOT NULL,
  `jam` char(11) NOT NULL,
  `hari` enum('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_kelas`, `kode_matkul`, `kode_dosen`, `kode_ruangan`, `jam`, `hari`) VALUES
(13, 'TIF1201', 'OPM', 'C-101', '08:00-10:30', 'Rabu'),
(13, 'TIF1207', 'SWL', 'C-101', '10:30-13:00', 'Rabu'),
(13, 'TIF1203', 'MFS', 'C-105', '13:00-15:30', 'Kamis'),
(13, 'TIF1205', 'UMY', 'C-106', '08:00-10:30', 'Jumat'),
(14, 'TIF1203', 'IVJ', 'C-103', '10:30-13:00', 'Rabu'),
(14, 'TIF1205', 'SRH', 'C-101', '13:50-16:20', 'Rabu'),
(14, 'TIF1207', 'MAB', 'C-101', '08:50-11:20', 'Jumat'),
(14, 'TIF1201', 'SNM', 'C-101', '13:50-16:20', 'Jumat'),
(15, 'TIF1203', 'IVJ', 'C-103', '08:00-10:30', 'Rabu'),
(15, 'TIF1205', 'SRH', 'C-106', '10:30-13:00', 'Rabu'),
(15, 'TIF1201', 'FNN', 'C-105', '08:00-10:30', 'Jumat'),
(15, 'TIF1207', 'RSS', 'C-104', '13:50-16:20', 'Jumat'),
(16, 'TIF2201', 'MAM', 'C-105', '08:00-10:30', 'Rabu'),
(16, 'TIF2204', 'DDA', 'C-102', '10:30-13:00', 'Rabu'),
(16, 'TIF2202', 'ROZ', 'C-102', '14:40-16:20', 'Rabu'),
(16, 'TIF2206', 'FNN', 'C-105', '08:00-09:40', 'Kamis'),
(16, 'TIF2203', 'VEN', 'C-105', '10:30-12:10', 'Jumat'),
(16, 'TIF2208', 'AIN', 'C-106', '13:50-16:20', 'Jumat'),
(17, 'TIF2201', 'ANN', 'C-104', '08:00-10:30', 'Rabu'),
(17, 'TIF2206', 'ANN', 'C-103', '13:00-14:40', 'Rabu'),
(17, 'TIF2203', 'FNN', 'C-106', '14:40-16:20', 'Rabu'),
(17, 'TIF2208', 'NSK', 'C-102', '08:00-10:30', 'Kamis'),
(17, 'TIF2204', 'UMY', 'C-106', '13:00-15:30', 'Kamis'),
(17, 'TIF2202', 'SFR', 'C-103', '13:50-15:30', 'Jumat'),
(18, 'TIF2204', 'DDA', 'C-102', '08:00-10:30', 'Rabu'),
(18, 'TIF2201', 'ULF', 'C-103', '10:30-13:00', 'Kamis'),
(18, 'TIF2202', 'VEN', 'C-102', '13:00-14:40', 'Kamis'),
(18, 'TIF2206', 'ERN', 'C-103', '08:00-09:40', 'Jumat'),
(18, 'TIF2203', 'ANN', 'C-106', '10:30-12:10', 'Jumat'),
(18, 'TIF2208', 'NSK', 'C-102', '13:50-16:20', 'Jumat'),
(19, 'TIF3205', 'VEN', 'C-104', '08:00-10:30', 'Senin'),
(19, 'TIF3203', 'SFR', 'C-104', '10:30-12:10', 'Senin'),
(19, 'TIF3207', 'ROZ', 'C-103', '13:50-15:30', 'Senin'),
(19, 'TIF3202', 'MYD', 'C-104', '10:30-12:10', 'Selasa'),
(19, 'TIF3201', 'ROM', 'C-103', '13:50-16:20', 'Selasa'),
(19, 'TIF3204', 'RSS', 'C-105', '13:50-16:20', 'Rabu'),
(19, 'TIF3209', 'ULF', 'C-102', '08:50-10:30', 'Jumat'),
(20, 'TIF3205', 'BAI', 'C-103', '08:00-10:30', 'Senin'),
(20, 'TIF3203', 'SEF', 'C-106', '10:30-12:10', 'Senin'),
(20, 'TIF3207', 'AIN', 'C-104', '13:50-15:30', 'Senin'),
(20, 'TIF3211', 'ERN', 'C-105', '08:00-09:40', 'Selasa'),
(20, 'TIF3202', 'ROM', 'C-105', '10:30-12:10', 'Selasa'),
(20, 'TIF3201', 'MYD', 'C-101', '13:50-16:20', 'Selasa'),
(20, 'TIF3204', 'ADE', 'C-104', '13:50-16:20', 'Rabu'),
(21, 'TIF3204', 'ADE', 'C-106', '08:00-10:30', 'Senin'),
(21, 'TIF3202', 'MAM', 'C-105', '10:30-12:10', 'Senin'),
(21, 'TIF3205', 'BAI', 'C-105', '13:50-16:20', 'Senin'),
(21, 'TIF3203', 'SWL', 'C-104', '13:00-14:40', 'Selasa'),
(21, 'TIF3207', 'ROZ', 'C-106', '08:00-09:40', 'Rabu'),
(21, 'TIF3201', 'RSS', 'C-105', '10:30-13:00', 'Rabu'),
(21, 'TIF3213', 'SNM', 'C-104', '08:50-10:30', 'Jumat'),
(22, 'TIF4511', 'MFS', 'C-102', '10:30-12:10', 'Jumat'),
(23, 'TIF4512', 'ROM', 'C-103', '10:30-12:10', 'Jumat'),
(24, 'TIF4513', 'SNM', 'C-104', '10:30-12:10', 'Jumat');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` int(10) UNSIGNED NOT NULL,
  `semester` char(1) NOT NULL,
  `kom` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `semester`, `kom`) VALUES
(1, '1', 'A'),
(2, '1', 'B'),
(3, '1', 'C'),
(4, '3', 'A'),
(5, '3', 'B'),
(6, '3', 'C'),
(7, '5', 'A'),
(8, '5', 'B'),
(9, '5', 'C'),
(10, '7', 'A'),
(11, '7', 'B'),
(12, '7', 'C'),
(13, '2', 'A'),
(14, '2', 'B'),
(15, '2', 'C'),
(16, '4', 'A'),
(17, '4', 'B'),
(18, '4', 'C'),
(19, '6', 'A'),
(20, '6', 'B'),
(21, '6', 'C'),
(22, '8', 'A'),
(23, '8', 'B'),
(24, '8', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `mata_kuliah`
--

CREATE TABLE `mata_kuliah` (
  `kode_matkul` char(7) NOT NULL,
  `nama_matkul` varchar(255) NOT NULL,
  `sks` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mata_kuliah`
--

INSERT INTO `mata_kuliah` (`kode_matkul`, `nama_matkul`, `sks`) VALUES
('MAT1101', 'Matematika Dasar', '3'),
('TIF1101', 'Pengantar Teknologi Informasi', '3'),
('TIF1102', 'Organisasi Arsitektur Komputer', '2'),
('TIF1103', 'Dasar Pemrograman', '3'),
('TIF1105', 'Pemrograman Web', '3'),
('TIF1201', 'Pemrograman Berorientasi Objek', '3'),
('TIF1203', 'Pemrograman Web Lanjutan', '3'),
('TIF1205', 'Sistem Basis Data', '3'),
('TIF1207', 'Struktur Data dan Algoritma', '3'),
('TIF2101', 'Matematika Diskrit', '3'),
('TIF2102', 'Komunikasi Data dan Jaringan Komputer', '2'),
('TIF2104', 'Manajemen Sistem Basis Data', '3'),
('TIF2106', 'Pemrograman Berorientasi Objek Lanjutan', '3'),
('TIF2108', 'Web Semantik', '3'),
('TIF2201', 'Analisis dan Desain Sistem', '3'),
('TIF2202', 'Jaminan dan Keamanan Informasi', '2'),
('TIF2203', 'Sistem Operasi', '2'),
('TIF2204', 'Interaksi Manusia dan Komputer', '3'),
('TIF2206', 'Kecerdasan Buatan', '2'),
('TIF2208', 'Keamanan Server dan Jaringan', '3'),
('TIF3101', 'Administrasi dan Desain Jaringan', '2'),
('TIF3103', 'Desain Interaksi', '2'),
('TIF3105', 'Fundamental Big Data', '3'),
('TIF3106', 'Pemrograman Mobile', '3'),
('TIF3108', 'Efek Visual dan Animasi', '2'),
('TIF3110', 'Pembelajaran Mesin', '2'),
('TIF3112', 'Internet of Things', '2'),
('TIF3201', 'Metodologi Penelitian', '3'),
('TIF3202', 'Etika Profesi', '2'),
('TIF3203', 'Probabilistik dan Statistik', '2'),
('TIF3204', 'Data Warehouse dan Bisnis Intelligence', '3'),
('TIF3205', 'Pemrograman Integrative', '3'),
('TIF3207', 'Routing Jaringan', '2'),
('TIF3209', 'Sistem Interaktif', '2'),
('TIF3211', 'Pemrograman Data Science', '2'),
('TIF3213', 'Cloud Computing', '2'),
('TIF4501', 'Pemrograman Mobile', '3'),
('TIF4502', 'Manajemen Proyek Teknologi Informasi', '2'),
('TIF4503', 'Enterprise Development Software', '3'),
('TIF4504', 'IT-Preneurship', '2'),
('TIF4505', 'Data Warehouse dan Bisnis Intelligence', '3'),
('TIF4506', 'Teknik Penulisan Karya Ilmiah', '2'),
('TIF4507', 'Sistem Interaktif', '2'),
('TIF4508', 'Pembelajaran Mesin Lanjutan', '2'),
('TIF4509', 'Sistem Sensor dan Aplikasi', '2'),
('TIF4511', 'Virtual dan Augmented Reality', '2'),
('TIF4512', 'Pemrosesan Citra Digital', '2'),
('TIF4513', 'Digital Forensik', '2');

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `kode_ruangan` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`kode_ruangan`) VALUES
('C-101'),
('C-102'),
('C-103'),
('C-104'),
('C-105'),
('C-106');

-- --------------------------------------------------------

--
-- Structure for view `gabungan`
--
DROP TABLE IF EXISTS `gabungan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `gabungan`  AS SELECT `a`.`id_kelas` AS `id_kelas`, `a`.`kode_matkul` AS `kode_matkul`, `a`.`kode_dosen` AS `kode_dosen`, `a`.`kode_ruangan` AS `kode_ruangan`, `a`.`jam` AS `jam`, `a`.`hari` AS `hari`, `b`.`semester` AS `semester`, `b`.`kom` AS `kom`, `c`.`nama_matkul` AS `nama_matkul`, `c`.`sks` AS `sks`, `d`.`nama_dosen` AS `nama_dosen` FROM (((`jadwal` `a` join `kelas` `b` on(`a`.`id_kelas` = `b`.`id_kelas`)) join `mata_kuliah` `c` on(`a`.`kode_matkul` = `c`.`kode_matkul`)) join `dosen` `d` on(`a`.`kode_dosen` = `d`.`kode_dosen`))  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`kode_dosen`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD KEY `fk_kelas` (`id_kelas`),
  ADD KEY `fk_dosen` (`kode_dosen`),
  ADD KEY `fk_mata_kuliah` (`kode_matkul`),
  ADD KEY `fk_ruangan` (`kode_ruangan`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  ADD PRIMARY KEY (`kode_matkul`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`kode_ruangan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
  MODIFY `id_kelas` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `fk_dosen` FOREIGN KEY (`kode_dosen`) REFERENCES `dosen` (`kode_dosen`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_kelas` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_mata_kuliah` FOREIGN KEY (`kode_matkul`) REFERENCES `mata_kuliah` (`kode_matkul`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ruangan` FOREIGN KEY (`kode_ruangan`) REFERENCES `ruangan` (`kode_ruangan`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
