-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2017 at 01:06 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_k-means`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` varchar(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
('1', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `cluster`
--

CREATE TABLE IF NOT EXISTS `cluster` (
  `id_cluster` int(11) NOT NULL AUTO_INCREMENT,
  `nis` varchar(15) NOT NULL,
  `tgl_cluster` date NOT NULL,
  `nilai` int(5) NOT NULL,
  `keterangan` enum('Tidak Disiplin','Cukup Disiplin','Disiplin') NOT NULL,
  PRIMARY KEY (`id_cluster`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `cluster`
--

INSERT INTO `cluster` (`id_cluster`, `nis`, `tgl_cluster`, `nilai`, `keterangan`) VALUES
(1, '8631', '2017-08-22', 3, 'Disiplin'),
(2, '8632', '2017-08-22', 1, 'Tidak Disiplin'),
(3, '8633', '2017-08-22', 3, 'Disiplin'),
(4, '8634', '2017-08-22', 2, 'Cukup Disiplin'),
(5, '8635', '2017-08-22', 3, 'Disiplin'),
(6, '8636', '2017-08-22', 1, 'Tidak Disiplin'),
(7, '8637', '2017-08-22', 2, 'Cukup Disiplin'),
(8, '8638', '2017-08-22', 3, 'Disiplin'),
(9, '8639', '2017-08-22', 2, 'Cukup Disiplin'),
(10, '8640', '2017-08-22', 1, 'Tidak Disiplin'),
(11, '8641', '2017-08-22', 3, 'Disiplin'),
(12, '8642', '2017-08-22', 2, 'Cukup Disiplin'),
(13, '8643', '2017-08-22', 3, 'Disiplin'),
(14, '8644', '2017-08-22', 2, 'Cukup Disiplin'),
(15, '8645', '2017-08-22', 2, 'Cukup Disiplin'),
(16, '8646', '2017-08-22', 3, 'Disiplin'),
(17, '8647', '2017-08-22', 3, 'Disiplin'),
(18, '8648', '2017-08-22', 3, 'Disiplin'),
(19, '8649', '2017-08-22', 3, 'Disiplin'),
(20, '8650', '2017-08-22', 3, 'Disiplin');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE IF NOT EXISTS `kelas` (
  `kd_kelas` varchar(11) NOT NULL,
  `nama_kelas` varchar(20) NOT NULL,
  `kuota` int(11) NOT NULL,
  PRIMARY KEY (`kd_kelas`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`kd_kelas`, `nama_kelas`, `kuota`) VALUES
('301', '3TITL1', 40),
('302', '3TKR1', 40),
('303', '3TKR2', 40),
('304', '3TKR3', 40),
('305', '3TP1', 40),
('306', '3TP2', 40),
('307', '3TPBO1', 40),
('308', '3TPBO2', 40),
('309', '3RPL1', 40),
('310', '3RPL2', 40),
('311', '3TSM1', 40),
('312', '3TSM2', 40);

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE IF NOT EXISTS `nilai` (
  `id_nilai` int(11) NOT NULL AUTO_INCREMENT,
  `nis` varchar(15) NOT NULL,
  `tanggal` date NOT NULL,
  `nilai1` float NOT NULL,
  `nilai2` float NOT NULL,
  `nilai3` float NOT NULL,
  `nilai4` float NOT NULL,
  `nilai5` float NOT NULL,
  PRIMARY KEY (`id_nilai`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=75 ;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id_nilai`, `nis`, `tanggal`, `nilai1`, `nilai2`, `nilai3`, `nilai4`, `nilai5`) VALUES
(74, '8640', '2017-08-24', 55, 66, 66, 66, 66),
(73, '8639', '2017-08-24', 66, 66, 66, 66, 66),
(72, '8638', '2017-08-24', 66, 66, 66, 66, 66),
(71, '8637', '2017-08-24', 77, 77, 77, 77, 77),
(70, '8636', '2017-08-24', 55, 66, 66, 66, 66),
(69, '8635', '2017-08-24', 55, 66, 66, 77, 88),
(68, '8634', '2017-08-24', 88, 88, 88, 88, 88),
(67, '8633', '2017-08-24', 88, 88, 88, 88, 88),
(66, '8632', '2017-08-24', 55, 55, 57, 88, 88),
(65, '8631', '2017-08-24', 66, 66, 77, 66, 88);

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE IF NOT EXISTS `siswa` (
  `nis` varchar(15) NOT NULL,
  `kd_kelas` varchar(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jns_kel` enum('Laki-laki','Perempuan') NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `thn_ajaran` varchar(11) NOT NULL,
  PRIMARY KEY (`nis`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nis`, `kd_kelas`, `nama`, `jns_kel`, `tempat_lahir`, `tgl_lahir`, `alamat`, `thn_ajaran`) VALUES
('8631', '301', 'noval bastian', 'Laki-laki', 'batang', '2001-07-11', 'bandar kab batang', '2016-2017'),
('8632', '301', 'dian purnomo', 'Laki-laki', 'pekalongan', '2001-07-12', 'wonokerto kab pekalongan', '2016-2017'),
('8633', '301', 'riza adha', 'Laki-laki', 'pekalongan', '2001-07-13', 'wonokerto kab pekalongan', '2016-2017'),
('8634', '301', 'wawan hermansyah', 'Laki-laki', 'pekalongan', '2001-07-21', 'panjang kota pekalongan', '2016-2017'),
('8635', '301', 'yanhandi herlambang', 'Laki-laki', 'pekalongan', '2000-07-14', 'kesesi kab pekalongan', '2016-2017'),
('8636', '301', 'afiff nugraha', 'Laki-laki', 'pekalongan', '2000-07-08', 'wiradesa kab pekalongan', '2016-2017'),
('8637', '301', 'muhammad ibnu', 'Laki-laki', 'pekalongan', '2000-07-06', 'wonopringgo kab pekalongan', '2016-2017'),
('8638', '301', 'tiyan arisaldi', 'Laki-laki', 'pemalang', '2001-07-07', 'ulujami kab pemalang', '2016-2017'),
('8639', '301', 'dwi agus', 'Laki-laki', 'pekalongan', '2000-07-22', 'karanganyar kab pekalongan', '2016-2017'),
('8640', '301', 'tabah rilo', 'Laki-laki', 'pekalongan', '2001-07-31', 'kradenan kota pekalongan', '2016-2017'),
('8641', '302', 'fajar milady', 'Laki-laki', 'pekalongan', '2001-08-01', 'wiradesa kab pekalongan', '2016-2017'),
('8642', '302', 'isman habibillah', 'Laki-laki', 'pekalongan', '2000-08-10', 'bojong kab pekalongan', '2016-2017'),
('8643', '302', 'aan putra', 'Laki-laki', 'pekalongan', '2000-08-31', 'wonokerto kab pekalongan', '2016-2017'),
('8644', '302', 'randita putra', 'Laki-laki', 'pekalongan', '2000-08-12', 'wiradesa kab pekalongan', '2016-2017'),
('8645', '302', 'alfian faiz', 'Laki-laki', 'pekalongan', '2000-08-17', 'pekalongan timur kota pekalongan', '2016-2017'),
('8646', '302', 'rodlo ', 'Laki-laki', 'pekalongan', '2001-08-25', 'wonokerto kab pekalongan', '2016-2017'),
('8647', '302', 'hasyim', 'Laki-laki', 'pekalongan', '2001-07-18', 'wiradesa kab pekalongan', '2016-2017'),
('8648', '302', 'dwi nugroho', 'Laki-laki', 'pekalongan', '2017-07-11', 'kajen kab pekalongan', '2016-2017'),
('8649', '302', 'wawan andita', 'Laki-laki', 'pekalongan', '2017-09-11', 'bojong kab pekalongan', '2016-2017'),
('8650', '302', 'riyan saputra', 'Laki-laki', 'pekalongan', '2017-07-11', 'wonopringgo kab pekalongan', '2016-2017'),
('8651', '303', 'wildan apriliyan', 'Laki-laki', 'pekalongan', '2001-08-10', 'kedungwuni  kab pekalongan', '2016-2017'),
('8652', '303', 'dede yuliansyah', 'Laki-laki', 'pemalang', '2000-08-01', 'comal kab pemalang', '2016-2017'),
('8653', '303', 'arif mukti', 'Laki-laki', 'pemalang', '2001-08-08', 'comal kab pemalang', '2016-2017'),
('8654', '303', 'ghofar ismail', 'Laki-laki', 'pemalang', '2000-08-19', 'kebondalem kab pemalang', '2016-2017'),
('8655', '303', 'anugrah budi', 'Laki-laki', 'pekalongan', '2000-08-05', 'pekalongan barat kota pekalongan', '2016-2017'),
('8656', '303', 'umam makruf', 'Laki-laki', 'pekalongan', '2000-08-05', 'pekalongan utara kota pekalongan', '2016-2017'),
('8657', '303', 'lutfi firmansyah', 'Laki-laki', 'pemalang', '2000-08-01', 'comal kab pemalang', '2016-2017'),
('8658', '303', 'bayu prayogo', 'Laki-laki', 'pekalongan', '2001-08-17', 'bojong kab pekalongan', '2016-2017'),
('8659', '303', 'm syarif', 'Laki-laki', 'pekalongan', '2000-08-26', 'pekalongan selatan kota pekalongan', '2016-2017'),
('8660', '303', 'ari kusti', 'Laki-laki', 'pekalongan', '2001-08-21', 'sragi kab pekalongan', '2016-2017');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(11) NOT NULL,
  `kd_kelas` varchar(11) NOT NULL,
  `username` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL,
  PRIMARY KEY (`id_user`),
  KEY `kd_kelas` (`kd_kelas`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `kd_kelas`, `username`, `password`) VALUES
('01', '301', '3titl1', '3titl1'),
('02', '302', '3tkr1', '3tkr1'),
('03', '303', '3tkr2', '3tkr2'),
('04', '304', '3tkr3', '3tkr3'),
('05', '305', '3tp1', '3tp1'),
('06', '306', '3tp2', '3tp2'),
('07', '307', '3tpbo1', '3tpbo1'),
('08', '308', '3tpbo2', '3tpbo2'),
('09', '309', '3rpl1', '3rpl1'),
('10', '310', '3rpl2', '3rpl2'),
('11', '311', '3tsm1', '3tsm1'),
('12', '312', '3tsm2', '3tsm2');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
