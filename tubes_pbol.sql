-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2023 at 03:56 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

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
(6, 'TIF2101', 'MLY', 'C-102', '10:30-13:00', 'Kamis'),
(6, 'TIF2104', 'DDA', 'C-105', '10:30-13:00', 'Rabu'),
(6, 'TIF2108', 'ANN', 'C-102', '13:50-16:20', 'Rabu'),
(6, 'TIF2102', 'NSK', 'C-105', '08:00-09:40', 'Kamis'),
(6, 'TIF2106', 'UMY', 'C-103', '13:50-16:20', 'Kamis'),
(4, 'TIF2104', 'DDA', 'C-105', '08:00-10:30', 'Rabu'),
(4, 'TIF2101', 'AGH', 'C-105', '13:50-16:20', 'Kamis'),
(4, 'TIF2106', 'SWL', 'C-104', '08:00-10:30', 'Jumat'),
(4, 'TIF2102', 'ROZ', 'C-104', '10:30-12:10', 'Jumat'),
(4, 'TIF2108', 'VEN', 'C-102', '13:50-16:20', 'Jumat'),
(5, 'TIF2106', 'SWL', 'C-103', '10:30-13:00', 'Rabu'),
(5, 'TIF2101', 'SEF', 'C-101', '13:50-16:20', 'Rabu'),
(5, 'TIF2104', 'SRH', 'C-104', '13:50-16:20', 'Kamis'),
(5, 'TIF2108', 'ANN', 'C-105', '08:00-10:30', 'Jumat'),
(5, 'TIF2102', 'SNM', 'C-103', '13:50-15:30', 'Jumat'),
(1, 'TIF1103', 'OPM', 'C-101', '08:00-10:30', 'Rabu'),
(1, 'TIF1101', 'MFS', 'C-101', '10:30-13:00', 'Rabu'),
(1, 'TIF1102', 'SNM', 'C-104', '14:40-16:20', 'Rabu'),
(1, 'MAT1101', 'AGH', 'C-104', '10:30-13:00', 'Kamis'),
(1, 'TIF1105', 'IVJ', 'C-103', '08:00-10:30', 'Jumat'),
(2, 'TIF1101', 'UMY', 'C-102', '08:00-10:30', 'Rabu'),
(2, 'TIF1103', 'ADE', 'C-102', '10:30-13:00', 'Rabu'),
(2, 'MAT1101', 'AGH', 'C-104', '08:00-10:30', 'Kamis'),
(2, 'TIF1102', 'NSK', 'C-101', '10:30-12:10', 'Jumat'),
(2, 'TIF1105', 'SFR', 'C-101', '13:50-16:20', 'Jumat'),
(3, 'TIF1105', 'IVJ', 'C-103', '08:00-10:30', 'Rabu'),
(3, 'TIF1102', 'ROZ', 'C-104', '10:30-12:10', 'Rabu'),
(3, 'MAT1101', 'MLY', 'C-102', '08:00-10:30', 'Kamis'),
(3, 'TIF1103', 'ADE', 'C-102', '13:50-16:20', 'Kamis'),
(3, 'TIF1101', 'MFS', 'C-102', '08:00-10:30', 'Jumat'),
(7, 'TIF3106', 'VEN', 'C-106', '10:30-13:00', 'Rabu'),
(7, 'TIF3103', 'INA', 'C-106', '14:40-16:20', 'Rabu'),
(7, 'TIF3101', 'AIN', 'C-101', '08:00-09:40', 'Kamis'),
(7, 'TIF3105', 'SFR', 'C-101', '08:00-10:30', 'Jumat'),
(7, 'TIF3108', 'MFS', 'C-106', '10:30-12:10', 'Jumat'),
(8, 'TIF3103', 'FNN', 'C-106', '08:00-09:40', 'Kamis'),
(8, 'TIF3106', 'AIN', 'C-106', '13:50-16:20', 'Kamis'),
(8, 'TIF3110', 'ERN', 'C-102', '10:30-12:10', 'Jumat'),
(8, 'TIF3105', 'ULF', 'C-105', '13:50-16:20', 'Jumat'),
(9, 'TIF3106', 'VEN', 'C-106', '08:00-10:30', 'Rabu'),
(9, 'TIF3103', 'INA', 'C-106', '13:00-14:40', 'Rabu'),
(9, 'TIF3101', 'BAI', 'C-106', '08:00-09:40', 'Jumat'),
(9, 'TIF3112', 'SNM', 'C-103', '10:30-13:00', 'Jumat'),
(9, 'TIF3105', 'NSK', 'C-106', '13:50-16:20', 'Jumat'),
(10, 'TIF4502', 'MAM', 'C-105', '08:00-09:40', 'Senin'),
(10, 'TIF4506', 'MYD', 'C-104', '10:30-12:10', 'Senin'),
(10, 'TIF4503', 'BAI', 'C-104', '13:50-16:20', 'Senin'),
(10, 'TIF4504', 'ADE', 'C-106', '08:00-09:40', 'Selasa'),
(10, 'TIF4501', 'ROM', 'C-105', '13:50-16:20', 'Selasa'),
(10, 'TIF4505', 'FNN', 'C-104', '08:00-10:30', 'Rabu'),
(10, 'TIF4507', 'AIN', 'C-105', '10:30-12:10', 'Jumat'),
(11, 'TIF4506', 'SRH', 'C-106', '10:30-12:10', 'Senin'),
(11, 'TIF4505', 'FNN', 'C-105', '13:50-16:20', 'Senin'),
(11, 'TIF4502', 'MAM', 'C-104', '08:00-09:40', 'Selasa'),
(11, 'TIF4503', 'RSS', 'C-106', '13:50-16:20', 'Selasa'),
(11, 'TIF4508', 'ERN', 'C-105', '13:00-14:40', 'Rabu'),
(11, 'TIF4504', 'ROZ', 'C-103', '14:40-16:20', 'Rabu'),
(11, 'TIF4501', 'ROM', 'C-104', '13:50-16:20', 'Jumat'),
(12, 'TIF4502', 'ANN', 'C-106', '08:50-10:30', 'Senin'),
(12, 'TIF4503', 'RSS', 'C-105', '10:30-13:00', 'Senin'),
(12, 'TIF4501', 'ROM', 'C-106', '13:50-16:20', 'Senin'),
(12, 'TIF4506', 'SRH', 'C-104', '13:00-14:40', 'Selasa'),
(12, 'TIF4504', 'ROZ', 'C-104', '14:40-16:20', 'Selasa'),
(12, 'TIF4509', 'SNM', 'C-103', '08:00-09:40', 'Kamis'),
(12, 'TIF4505', 'BAI', 'C-101', '13:00-15:30', 'Kamis');

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
(12, '7', 'C');

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
('TIF2101', 'Matematika Diskrit', '3'),
('TIF2102', 'Komunikasi Data dan Jaringan Komputer', '2'),
('TIF2104', 'Manajemen Sistem Basis Data', '3'),
('TIF2106', 'Pemrograman Berorientasi Objek Lanjutan', '3'),
('TIF2108', 'Web Semantik', '3'),
('TIF3101', 'Administrasi dan Desain Jaringan', '2'),
('TIF3103', 'Desain Interaksi', '2'),
('TIF3105', 'Fundamental Big Data', '3'),
('TIF3106', 'Pemrograman Mobile', '3'),
('TIF3108', 'Efek Visual dan Animasi', '2'),
('TIF3110', 'Pembelajaran Mesin', '2'),
('TIF3112', 'Internet of Things', '2'),
('TIF4501', 'Pemrograman Mobile', '3'),
('TIF4502', 'Manajemen Proyek Teknologi Informasi', '2'),
('TIF4503', 'Enterprise Development Software', '3'),
('TIF4504', 'IT-Preneurship', '2'),
('TIF4505', 'Data Warehouse dan Bisnis Intelligence', '3'),
('TIF4506', 'Teknik Penulisan Karya Ilmiah', '2'),
('TIF4507', 'Sistem Interaktif', '2'),
('TIF4508', 'Pembelajaran Mesin Lanjutan', '2'),
('TIF4509', 'Sistem Sensor dan Aplikasi', '2');

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

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `gabungan`  AS SELECT `a`.`id_kelas` AS `id_kelas`, `a`.`kode_matkul` AS `kode_matkul`, `a`.`kode_dosen` AS `kode_dosen`, `a`.`kode_ruangan` AS `kode_ruangan`, `a`.`jam` AS `jam`, `a`.`hari` AS `hari`, `b`.`semester` AS `semester`, `b`.`kom` AS `kom`, `c`.`nama_matkul` AS `nama_matkul`, `c`.`sks` AS `sks`, `d`.`nama_dosen` AS `nama_dosen` FROM (((`jadwal` `a` join `kelas` `b` on(`a`.`id_kelas` = `b`.`id_kelas`)) join `mata_kuliah` `c` on(`a`.`kode_matkul` = `c`.`kode_matkul`)) join `dosen` `d` on(`a`.`kode_dosen` = `d`.`kode_dosen`)) ;

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
  MODIFY `id_kelas` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

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
