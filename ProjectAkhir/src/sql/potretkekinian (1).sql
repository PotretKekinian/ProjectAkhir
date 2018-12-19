-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 19 Des 2018 pada 19.59
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `potretkekinian`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `password` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`password`, `username`) VALUES
('admin', 'admin'),
('123', 'coba');

-- --------------------------------------------------------

--
-- Struktur dari tabel `motorkeluar`
--

CREATE TABLE `motorkeluar` (
  `merk` varchar(10) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nopol` int(11) NOT NULL,
  `warna` varchar(255) NOT NULL,
  `jt` varchar(255) NOT NULL,
  `tglklr` date NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `motormasuk`
--

CREATE TABLE `motormasuk` (
  `id` int(50) NOT NULL,
  `merk` varchar(20) NOT NULL,
  `tipe` varchar(255) NOT NULL,
  `nopol` int(11) NOT NULL,
  `warna` varchar(255) NOT NULL,
  `jt` varchar(255) NOT NULL,
  `tglmsk` date NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noHp` int(11) NOT NULL,
  `NIK` int(11) NOT NULL,
  `merk` varchar(10) NOT NULL,
  `tipe` varchar(255) NOT NULL,
  `nopol` int(11) NOT NULL,
  `warna` varchar(255) NOT NULL,
  `jt` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembali` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `motormasuk`
--
ALTER TABLE `motormasuk`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `motormasuk`
--
ALTER TABLE `motormasuk`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
