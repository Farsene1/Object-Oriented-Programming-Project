--
-- PostgreSQL database dump
--

-- Dumped from database version 11.2
-- Dumped by pg_dump version 11.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: Food; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Food" (
    "foodID" integer NOT NULL,
    "mealType" character varying NOT NULL,
    "polarScore" integer NOT NULL
);


ALTER TABLE public."Food" OWNER TO postgres;

--
-- Name: FoodType; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."FoodType" (
    "mealType" character varying NOT NULL,
    meat boolean NOT NULL,
    dairy boolean NOT NULL,
    vegetables boolean NOT NULL,
    carbohydrates boolean NOT NULL,
    "CO2" integer NOT NULL
);


ALTER TABLE public."FoodType" OWNER TO postgres;

--
-- Name: Score; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Score" (
    "userID" integer NOT NULL,
    date date NOT NULL,
    "totalCO2Score" integer NOT NULL,
    "totalPolarTotal" integer NOT NULL
);


ALTER TABLE public."Score" OWNER TO postgres;

--
-- Name: Transport; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Transport" (
    "transportID" integer NOT NULL,
    "polarScore" integer NOT NULL,
    "transportType" integer NOT NULL
);


ALTER TABLE public."Transport" OWNER TO postgres;

--
-- Name: TransportType; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."TransportType" (
    "transportType" integer NOT NULL,
    "fuelType" character varying,
    distance integer NOT NULL,
    consumption integer NOT NULL,
    "CO2" integer NOT NULL
);


ALTER TABLE public."TransportType" OWNER TO postgres;

--
-- Name: User; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."User" (
    "userID" integer NOT NULL,
    username character varying NOT NULL,
    password character varying NOT NULL,
    email character varying NOT NULL,
    "DoB" date NOT NULL,
    sex character varying NOT NULL,
    name character varying NOT NULL,
    "CO2Footprint" integer NOT NULL,
    "transportID" integer NOT NULL,
    "waterID" integer NOT NULL,
    "foodID" integer NOT NULL
);


ALTER TABLE public."User" OWNER TO postgres;

--
-- Name: Water; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Water" (
    "waterID" integer NOT NULL,
    "waterType" character varying NOT NULL,
    "polarScore" integer NOT NULL
);


ALTER TABLE public."Water" OWNER TO postgres;

--
-- Name: WaterType; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."WaterType" (
    "waterType" character varying NOT NULL,
    amount integer NOT NULL,
    "CO2" integer NOT NULL
);


ALTER TABLE public."WaterType" OWNER TO postgres;

--
-- Name: FoodType FoodType_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."FoodType"
    ADD CONSTRAINT "FoodType_pkey" PRIMARY KEY ("mealType");


--
-- Name: Food Food_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Food"
    ADD CONSTRAINT "Food_pkey" PRIMARY KEY ("foodID");


--
-- Name: Score Score_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Score"
    ADD CONSTRAINT "Score_pkey" PRIMARY KEY ("userID");


--
-- Name: TransportType TransportType_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."TransportType"
    ADD CONSTRAINT "TransportType_pkey" PRIMARY KEY ("transportType");


--
-- Name: Transport Transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Transport"
    ADD CONSTRAINT "Transport_pkey" PRIMARY KEY ("transportID");


--
-- Name: User User_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "User_pkey" PRIMARY KEY ("userID");


--
-- Name: WaterType WaterType_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."WaterType"
    ADD CONSTRAINT "WaterType_pkey" PRIMARY KEY ("waterType");


--
-- Name: Water Water_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Water"
    ADD CONSTRAINT "Water_pkey" PRIMARY KEY ("waterID");


--
-- Name: User foodID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "foodID" FOREIGN KEY ("foodID") REFERENCES public."Food"("foodID");


--
-- Name: Food mealType; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Food"
    ADD CONSTRAINT "mealType" FOREIGN KEY ("mealType") REFERENCES public."FoodType"("mealType");


--
-- Name: User transportID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "transportID" FOREIGN KEY ("transportID") REFERENCES public."Transport"("transportID");


--
-- Name: Transport transportType; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Transport"
    ADD CONSTRAINT "transportType" FOREIGN KEY ("transportType") REFERENCES public."TransportType"("transportType");


--
-- Name: Score userID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Score"
    ADD CONSTRAINT "userID" FOREIGN KEY ("userID") REFERENCES public."User"("userID");


--
-- Name: User waterID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "waterID" FOREIGN KEY ("waterID") REFERENCES public."Water"("waterID");


--
-- Name: Water waterType; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Water"
    ADD CONSTRAINT "waterType" FOREIGN KEY ("waterType") REFERENCES public."WaterType"("waterType");


--
-- PostgreSQL database dump complete
--

